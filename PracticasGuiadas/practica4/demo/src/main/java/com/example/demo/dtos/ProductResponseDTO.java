package com.example.demo.dtos;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductResponseDTO(
    UUID resourceID,
    String nombre, 
    String descripcion,
    BigDecimal precio) {
        
}
