package com.example.demo.service.Impl;

import com.example.demo.service.Validationservice;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.demo.exception.ValidationException;
@Service
public class Validationserviceimpl implements Validationservice{
    @Autowired ValidationRepository student;
    @Override
    public ValidationEntity postdata(ValidationEntity val){
        return student.save(val);
    }
     @Override
        public ValidationEntity getValue(Long id){
            return student.findById(id).orElseThrow(()->new ValidationException("Invalid Id"+id));
        }
}