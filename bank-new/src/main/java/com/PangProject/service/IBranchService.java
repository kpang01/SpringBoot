package com.PangProject.service;

import java.time.LocalDateTime;
import java.util.List;

import com.PangProject.entity.BranchEntity;

public interface IBranchService {

    List<BranchEntity> getAllBranches();

    BranchEntity getBranchById(Long id);

    BranchEntity createBranch(BranchEntity branch);

    void deleteBranch(Long id);

    List<BranchEntity> searchBranchByName(String name);

    List<BranchEntity> searchBranchByCreationDateBetween(LocalDateTime from, LocalDateTime to);
}