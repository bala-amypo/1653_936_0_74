package com.example.demo.service.Impl;

import com.example.demo.service.Studentservice;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class Studentserviceimpl implements Studentservice{
    @Autowired Studentrepository student;
    @Override
    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu);
    }