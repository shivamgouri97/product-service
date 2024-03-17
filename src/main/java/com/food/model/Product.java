package com.food.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity()
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String restaurantId;
    private String name;
    private String description;
    private Double price;
    private Double quantity;
}
