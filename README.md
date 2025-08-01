# User-Management-REST-API
This project is a simple User Management RESTful API built using Java Spring Boot, designed to perform basic CRUD operations — Create, Read, Update, and Delete user data.
# User Management REST API

A simple RESTful API to manage user data — create, read, update, and delete users — built with Java Spring Boot and backed by an SQL database.

---

## Features

- Create new users  
- Retrieve user details  
- Update user information  
- Delete users

---

## Technology Stack

- **Java**  
- **Spring Boot**  
- **SQL Database** (e.g., MySQL, PostgreSQL)  
- **Postman** (for API testing)

---

## API Endpoints

| HTTP Method | Endpoint          | Description           |
|-------------|-------------------|-----------------------|
| POST        | `/user`          | Add a new user        |
| GET         | `/getAll`          | Get all users         |
| GET         | `/get/{id}`     | Get user by ID        |
| PUT         | `/update/{id}`     | Update user by ID     |
| DELETE      | `/del/{id}`     | Delete user by ID     |

---

## Setup Instructions

1. **Clone the repository**  
   ```bash
   git clone https://github.com/Divyasree799-Dev/User-Management-REST-API.git

2.Configure database
Update your application.properties  file with your database credentials.

3.Build and run the application   
4.Test API using Postman
Use Postman to send requests to your endpoints (default URL: (http://localhost:8082/user)).You can change server port

Example API Request (Using Postman)
Create User (POST)
URL: (http://localhost:8082/user)
Body (JSON):

json
{
    "name":"divya",
    "department":"PPP",
    "email":"abc@gmail.com",
    "phone":"78299289282"
}
Get All Users (GET)
URL: (http://localhost:8082/getAll)

Author
Divyasree Boli

bolidivyasree8522@gmail.com

https://github.com/Divyasree799-Dev



