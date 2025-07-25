package com.PangProject.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.PangProject.entity.CustomerEntity;
import com.PangProject.model.CustomerDTO;

@Mapper
public interface CustomerMapper {

	@Mapping(target = "accountDTOs", source = "accountEntities")
	CustomerDTO toDto(CustomerEntity entity);

	@Mapping(target = "accountEntities", source = "accountDTOs")
	CustomerEntity toEntity(CustomerDTO dto);
	
    List<CustomerDTO> toDtoList(List<CustomerEntity> entityList);

    List<CustomerEntity> toEntityList(List<CustomerDTO> dtoList);
}
