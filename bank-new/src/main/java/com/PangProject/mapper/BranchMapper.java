package com.PangProject.mapper;

import com.PangProject.entity.BranchEntity;
import com.PangProject.model.BranchDTO;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BranchMapper {

    BranchDTO toDto(BranchEntity entity);

    BranchEntity toEntity(BranchDTO dto);

    List<BranchDTO> toDtoList(List<BranchEntity> entityList);

    List<BranchEntity> toEntityList(List<BranchDTO> dtoList);
}