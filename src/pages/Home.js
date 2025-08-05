import React, { useState,useEffect} from 'react';
import axios from "axios";
import { Link, useNavigate, useParams } from 'react-router-dom'

export default function Home() {
  const [users,setUsers]=useState([]);

  const {id}=useParams()
  useEffect(()=>{
    loadUsers();

  },[]);
  const loadUsers=async()=>{
    const result =await axios.get("http://localhost:8082/getAll");
    setUsers(result.data);
  };

  const deleteUser = async(id)=>{
    await axios.delete(`http://localhost:8082/del/${id}`);
    loadUsers();
  };
  return (
    <div className="container">
        <div className="py-4">
        <table className="table border shadow">
  <thead>
    <tr>
    <th scope="col">#</th>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Department</th>
      <th scope="col">EmailId</th>
      <th scope="col">Phone Number</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    {
      users.map((user,i)=>(
        <tr>
        <th scope="row" key={i}>{(i+1)}</th>
        <td>{(user.id)}</td>
        <td>{user.name}</td>
        <td>{user.department}</td>
        <td>{user.emailId}</td>
        <td>{user.phone}</td>
        <td>
          <Link className="btn btn-primary mx-2" to = {`/viewUser/${user.id}`}>view</Link>
          <Link className="btn btn-outline-primary mx-2" to={`/edituser/${user.id}`}>Edit</Link>
          <button className="btn btn-danger mx-2"
          onClick={()=>deleteUser(user.id)}
          >Delete</button>
        </td>
      </tr> 
      ))
    }
  </tbody>
</table>
        </div>

    </div>
  )
}
