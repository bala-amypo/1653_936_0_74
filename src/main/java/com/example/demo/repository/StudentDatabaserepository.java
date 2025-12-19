package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentDatabaseEntity;
@Repository
public interface StudentDatabaserepository extends JpaRepository<StudentDatabaseEntity,Integer>{

}