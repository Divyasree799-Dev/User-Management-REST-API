package com.example.fullsSack.Model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String department;
    private String emailId;
    private String phone;
    /**
     * @param id
     * @param name
     * @param department
     * @param emailId
     * @param phone
     */
    public User(Long id, String name, String department, String emailId, String phone) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
        this.emailId = emailId;
        this.phone = phone;
    }

    public User() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }
    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }
    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", department=" + department + ", emailId=" + emailId + ", phone="
                + phone + "]";
    }

}
