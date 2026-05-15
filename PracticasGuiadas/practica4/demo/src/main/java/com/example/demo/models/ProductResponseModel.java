package com.example.demo.models;

import java.math.BigDecimal;
import java.util.UUID;



public record ProductResponseModel(
        UUID resourceID,
        String nombre,
        String description,
        BigDecimal precio) {
}
