package com.example.demo.service.Impl;

import com.example.demo.service.StudenDatabasetservice;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentDatabaseEntity;
import com.example.demo.repository.StudentDatabaserepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class StudentDatabaseserviceimpl implements StudentDarabaseservice{
    @Autowired StudentDatabaserepository student;
    @Override
    public StudentDatabaseEntity post(StudentDatabaseEntity stu){
        return student.save(stu);
    }
    }