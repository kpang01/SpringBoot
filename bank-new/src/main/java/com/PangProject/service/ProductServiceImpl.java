package com.PangProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PangProject.entity.ProductEntity;
import com.PangProject.repo.IProductRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductServiceImpl implements IProductService {

	
	@Autowired
	private IProductRepo productRepo;
	 
    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity getProductById(Long id) {
        return productRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Account not found"));
    }

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepo.save(product);
    }

    @Override
    public ProductEntity updateProduct(Long id, ProductEntity updatedProduct) {
        ProductEntity existing = getProductById(id);
        existing.setProductName(updatedProduct.getProductName());
        existing.setDescription(updatedProduct.getDescription());
        return productRepo.save(existing);
    }
    
    

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }
}
