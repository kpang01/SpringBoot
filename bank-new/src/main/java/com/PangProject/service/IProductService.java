package com.PangProject.service;

import java.util.List;

import com.PangProject.entity.ProductEntity;

public interface IProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity getProductById(Long id);
    ProductEntity createProduct(ProductEntity product);
    ProductEntity updateProduct(Long id, ProductEntity updatedProduct);
    void deleteProduct(Long id);
}
