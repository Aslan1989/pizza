package com.example.pizza.controller;

import com.example.pizza.entity.Cafe;
import com.example.pizza.repository.CafeRepository;
import com.example.pizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CafeController {


    private CafeRepository cafeRepository;
    @Autowired
    public CafeController(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }


    private PizzaRepository pizzaRepository;
    @Autowired
    public CafeController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping("/cafe")
    public ResponseEntity<Iterable<Cafe>> getCafe(){
        return new ResponseEntity<>(cafeRepository.findAll(), HttpStatus.OK);
    }
}
