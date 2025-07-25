package com.PangProject.validation;

import com.demo.exceptions.DemoAppException;

public class BranchValidation {
	
	public static void validateBranchName(String branchName) {
		if (branchName == null || branchName.isBlank()) {
			throw new DemoAppException("Item name cannot be empty or blank.");
		}
	}

}
