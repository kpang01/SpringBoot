package com.PangProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PangProject.entity.ProductEntity;

public interface IProductRepo extends JpaRepository<ProductEntity, Long> {
}
