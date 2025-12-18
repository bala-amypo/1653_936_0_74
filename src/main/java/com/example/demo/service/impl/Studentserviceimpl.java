package com.example.demo.service.Impl;

import com.example.demo.service.Studentservice;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@service
public class Studentserviceimpl implements Studentservices{
    @Autowired Studentrepository student;
    @override
    public StudentEntity postData(StudentEntity stu){
        return student.save(stu);
    }
        @Override
        public List<StudentEntity>getAllData(){
            return student.findAll();
        }
        @Override
        public String DeleteData(int id){
            student.deleteById(id);
            return "Deleted Successfully";
        }
        @Override
        public StudentEntity getData(int id){
            return student.findById(id).orElse (null);
        }
        @Override
        public StudentEntity putData(int id, StudentEntity entity){
            if(student.existsById(id)){
                entity.setId(id);
                return student.save(entity);
            }
            return null;
        }
    }