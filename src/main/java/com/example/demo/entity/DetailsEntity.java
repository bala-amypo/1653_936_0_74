
package com.example.demo.entity;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistance.OneToOne;
import jakarta.persistance.JoinColumn;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailsEntity{
@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private int cardnum;
    @OneToOne
    @JoinColumn(name = "student_id")
    private StudentDatabaseEntity student;


}