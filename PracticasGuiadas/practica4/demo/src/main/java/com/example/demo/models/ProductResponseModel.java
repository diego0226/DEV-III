package com.example.demo.models;

import java.math.BigDecimal;



public record ProductResponseModel(
        String nombre,
        String description,
        BigDecimal precio) {
}
