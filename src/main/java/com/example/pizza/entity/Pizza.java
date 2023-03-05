package com.example.pizza.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@Entity
@Data
@Getter
@Setter
@Table(name = "pizza")
@ToString
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "PIZZA_NAME", length = 50, nullable = false, unique = false)
    private String pizzaName;
    @Column(name = "PIZZA_SIZE", length = 50, nullable = false, unique = false)
    private String pizzaSize;
    @Column(name = "KEY_INGREDIENTS", length = 50, nullable = false, unique = false)
    private String key_ingredients;
    @Column(name = "PIZZA_PRICE", columnDefinition = " Decimal(10,2) default '0.00' ", nullable = false)
    private BigDecimal pizzaPrice;

    public Pizza(String pizzaName, String pizzaSize, String key_ingredients, BigDecimal pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.key_ingredients = key_ingredients;
        this.pizzaPrice = pizzaPrice;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    // @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "cafe_id", nullable = false)
    @JsonIgnore
    @ToString.Exclude
    private Cafe cafe;
}
