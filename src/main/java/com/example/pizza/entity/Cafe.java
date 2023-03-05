package com.example.pizza.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cafe")
@Data
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "CAFE_NAME", length = 50, nullable = false, unique = false)
    private String cafeName;
    @Column(name = "CITY_NAME", length = 50, nullable = false, unique = false)
    private String city;
    @Column(name = "ADDRESS_NAME", length = 50, nullable = false, unique = false)
    private String address;
    @Column(name = "EMAIL_NAME", length = 50, nullable = false, unique = false)
    private String email;
    @Column(name = "PHONE", length = 50, nullable = false, unique = false)
    private String phone;
    @Column(name = "PIZZA_MENU")
    private List<Pizza> pizza_menu;

    public Cafe(String cafeName, String city, String address, String email, String phone, List<Pizza> pizza_menu) {
        this.cafeName = cafeName;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.pizza_menu = pizza_menu;
    }

    @OneToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "cafe_id")
    @JsonIgnore
    private List<Pizza> pizza = new ArrayList<>();
}
