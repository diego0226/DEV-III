package com.example.demo.facade;

import java.util.List;

import com.example.demo.dtos.ProductResponseDTO;

public interface IProductoFacade {
    List<ProductResponseDTO> getAll();
}
