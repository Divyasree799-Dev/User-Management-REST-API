import axios from 'axios'
import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'

export default function AddUser() {
    let navigate=useNavigate();
    const [user,setUser]=useState({
        name:"",
        department:"",
        emailId:"",
        phone:""
    })
    const{name,department,emailId,phone}=user
    const onInputChange=(e)=>{
        setUser({...user, [e.target.name]: e.target.value})
    }
    const onSubmit=async (e) => {
        e.preventDefault();
        await axios.post("http://localhost:8082/user",user)
        navigate("/")
    }
  return (
    <div className="container">
        <div className="row">
            <div className="col-md-6 offset-md-3 borderrounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Register User</h2>
                <form onSubmit={(e) => onSubmit(e)}>
                <div className="mb-3">
                    <label htmlFor="Name" className='form-label'>
                        Name
                    </label>
                    <input type={"text"}
                    className='form-control'
                    placeholder='Enter your Name'
                    name='name'
                    value={name}
                    onChange={(e)=>onInputChange(e)}
                    />
                </div>
                <div className="mb-3">
                    <label htmlFor="Department" className='form-label'>
                        Department
                    </label>
                    <input type={"text"}
                    className='form-control'
                    placeholder='Enter your Department'
                    name='department'
                    value={department}
                    onChange={(e)=>onInputChange(e)}
                    />
                </div>
                <div className="mb-3">
                    <label htmlFor="EmailId" className='form-label'>
                        EmailId
                    </label>
                    <input type={"text"}
                    className='form-control'
                    placeholder='Enter your EmailId'
                    name='emailId'
                    value={emailId}
                    onChange={(e)=>onInputChange(e)}
                    />
                </div>
                <div className="mb-3">
                    <label htmlFor="Phone" className='form-label'>
                        Phone:
                    </label>
                    <input type={"text"}
                    className='form-control'
                    placeholder='Enter your Phone'
                    name='phone'
                    value={phone}
                    onChange={(e)=>onInputChange(e)}
                    />
                </div>
                
                <button type="submit" className='btn btn-primary'>Submit</button>
                <Link className='btn btn-outline-danger mx-2'to ="/">Cancel</Link>
                </form>
            </div>
        </div>
        
    </div>
  )
}
