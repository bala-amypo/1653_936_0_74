package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.DetailsEntity;
@Repository
public interface Detailsrepository extends JpaRepository<DetailsEntity,Integer>{

}