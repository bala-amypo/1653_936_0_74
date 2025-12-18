package com.example.demo.entity;
import java.util.Date;
import jakarta.presistance.Entity;
import jakarta.presistance.GeneratedValue;
import jakarta.presistance.Generationype;
import jakarta.presistance.Id;
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
    public StudentEntity(Integer id,String name, String email, String password,Date created){
        this.id = id;
        this.name = name;
        this.email =email;
        this.password = password;
        this.created = created;
    }
    
}