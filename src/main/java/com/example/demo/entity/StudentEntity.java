package com.example.demo.entity;
import java.util.Date;
import jakarta.persistance.Entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationType;
import jakarta.persistance.Id;
@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;
    public StudentEntity(){
        
    }
 
    public Integer getId(){
       return id;
    }
    public String getName(){
      return name;
    }
    public String getEmail(){
      return email;
    }
    public String getPassword(){
    return password;
    }
    public Date getCreated(){
    return created;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setCreated(Date created){
        this.created = created;
    }
       public StudentEntity(Integer id,String name, String email, String password,Date created){
        this.id = id;
        this.name = name;
        this.email =email;
        this.password = password;
        this.created = created;
    }
}