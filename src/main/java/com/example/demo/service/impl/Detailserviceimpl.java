package com.example.demo.service.Impl;

import com.example.demo.service.Detailservice;
import org.springframework.stereotype.Service;
import com.example.demo.entity.DetailsEntity;
import com.example.demo.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class Studentserviceimpl implements Studentservice{
    @Autowired Detailsrepository student;
    @Override
    public DetailsEntity postdata(DetailsEntity stu){
        return student.save(stu);
    }
    }