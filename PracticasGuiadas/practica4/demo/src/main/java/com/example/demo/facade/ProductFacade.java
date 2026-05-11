package com.example.demo.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.ProductResponseDTO;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.services.ProductServices;

@Component

public class ProductFacade implements IProductoFacade{
    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductServices productService;
    @Override
    public List<ProductResponseDTO> getAll() {
        return productMapper.toProductDtoList(productService.getAll());
    }
}
