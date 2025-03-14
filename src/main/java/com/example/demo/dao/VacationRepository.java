package com.example.demo.dao;

import com.example.demo.entities.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200") // Allow Angular to access this endpoint
public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
