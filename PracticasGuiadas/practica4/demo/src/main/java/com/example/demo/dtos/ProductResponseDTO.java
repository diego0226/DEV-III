package com.example.demo.dtos;

import java.math.BigDecimal;

public record ProductResponseDTO(
    String nombre, 
    String descripcion,
    BigDecimal precio) {
        
}
