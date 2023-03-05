package com.example.pizza.repository;

import com.example.pizza.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CafeRepository extends JpaRepository<Cafe, Integer> {
}
