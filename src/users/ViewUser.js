import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom'
import axios from 'axios'


export default function ViewUser() {
    const [user,setUser]=useState({
            id:"",
            name:"",
            department:"",
            emailId:"",
            phone:""
        })

        const {id} = useParams();

        useEffect(()=>{
            loadUser()

        },[])
        const loadUser=async ()=>{
            const result = await axios.get(`http://localhost:8082/get/${id}`)
            setUser(result.data)
        }

   

  return (
    <div className="container">
    <div className="row">
        <div className="col-md-6 offset-md-3 borderrounded p-4 mt-2 shadow">
            <h2 className="text-center m-4">User Details</h2>
            <div className="card">
                <div className="card-header">
                    Details of user id:
                    <ul className="list-group list-group-flush">
                        <li className="list-group-item">
                            <b>Id:</b>
                            {user.id}
                        </li>
                        <li className="list-group-item">
                            <b>Name:</b>
                            {user.name}
                        </li>
                        <li className="list-group-item">
                            <b>Department:</b>
                            {user.department}
                        </li>
                        <li className="list-group-item">
                            <b>Email Id:</b>
                            {user.emailId}
                        </li>
                        <li className="list-group-item">
                            <b>Phone Number:</b>
                            {user.phone}
                        </li>
                    </ul>
                </div>
            </div>
            <Link className="btn btn-primary my-2" to={"/"}>Back To Home</Link>
    </div>
    </div>
    </div>
  )
}
