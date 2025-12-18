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
    
}