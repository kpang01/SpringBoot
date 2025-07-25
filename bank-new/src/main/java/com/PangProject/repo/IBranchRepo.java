package com.PangProject.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PangProject.entity.BranchEntity;

public interface IBranchRepo extends JpaRepository<BranchEntity, Long> {

	List<BranchEntity> findByBranchNameContainingIgnoreCase(String name);

	List<BranchEntity> findByCreationDateBetween(LocalDateTime from, LocalDateTime to);
}