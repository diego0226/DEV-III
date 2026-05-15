package com.example.demo.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.dtos.ProductResponseDTO;
import com.example.demo.entities.Product;
import com.example.demo.models.ProductResponseModel;

@Component
public class ProductMapper {
    public ProductResponseDTO toProductDto(Product product) {
        if (product == null) {
            return null;
        }
        return new ProductResponseDTO(product.getResourceId(), product.getNombre(), product.getDescripcion(), product.getPrecio());
    }

    public List<ProductResponseDTO> toProductDtoList(List<Product> products) {
        if (products == null) {
            return null;
        }

        return products.stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    }

    //El que ya se va mostrar al usuario
    public ProductResponseModel toProductResponseModel(ProductResponseDTO productDTO) {
        if (productDTO == null) {
            return null;
        }
        return new ProductResponseModel(productDTO.resourceID(), productDTO.nombre(), productDTO.descripcion(), productDTO.precio());
    }

    public List<ProductResponseModel> toProductResponseModelList(List<ProductResponseDTO> productsResponseDTO) {
        if (productsResponseDTO == null) {
            return null;
        }

        return productsResponseDTO.stream()
                .map(this::toProductResponseModel)
                .collect(Collectors.toList());
    }
}
