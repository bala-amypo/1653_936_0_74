package com.example.demo.service.Impl;

import com.example.demo.service.Timestampservice;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.repository.Timestamprepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class Timestampserviceimpl implements Timestampservice{
    @Autowired Timestamprepository student;
    @Override
    public TimestampEntity postime(TimestampEntity stu){
        return student.save(stu);
    }
}