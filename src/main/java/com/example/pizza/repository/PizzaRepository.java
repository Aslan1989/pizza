package com.example.pizza.repository;

import com.example.pizza.entity.Cafe;
import com.example.pizza.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
