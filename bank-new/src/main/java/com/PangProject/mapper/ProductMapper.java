package com.PangProject.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.PangProject.entity.ProductEntity;
import com.PangProject.model.ProductDTO;

@Mapper
public interface ProductMapper {

    ProductDTO toDto(ProductEntity entity);

    ProductEntity toEntity(ProductDTO dto);

    List<ProductDTO> toDtoList(List<ProductEntity> entityList);

    List<ProductEntity> toEntityList(List<ProductDTO> dtoList);
}
