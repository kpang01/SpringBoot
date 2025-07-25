package com.PangProject.service;

import com.PangProject.entity.BranchEntity;
import com.PangProject.repo.IBranchRepo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements IBranchService {

    private final IBranchRepo branchRepo;

    @Override
    public List<BranchEntity> getAllBranches() {
        return branchRepo.findAll();
    }



    @Override
    public BranchEntity createBranch(BranchEntity branch) {
        return branchRepo.save(branch);
    }

    @Override
    public void deleteBranch(Long id) {
        if (!branchRepo.existsById(id)) {
       //     throw new DemoAppException("Cannot delete. Branch not found with ID: " + id);
        }
        branchRepo.deleteById(id);
    }

    @Override
    public List<BranchEntity> searchBranchByName(String name) {
        return branchRepo.findByBranchNameContainingIgnoreCase(name);
    }

    @Override
    public List<BranchEntity> searchBranchByCreationDateBetween(LocalDateTime from, LocalDateTime to) {
        return branchRepo.findByCreationDateBetween(from, to);
    }



	@Override
	public BranchEntity getBranchById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}