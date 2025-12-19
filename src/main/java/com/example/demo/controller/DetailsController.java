package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.Detailservice;
import com.example.demo.entity.DetailsEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
@RestController
public class DetailsController{
    @Autowired Detailservice service;
    @PostMapping("/postDetail")
    public StudentDatabaseEntity postval(@RequestBody DetailsEntity entity){
        return service.postDetail(entity);
    }
}