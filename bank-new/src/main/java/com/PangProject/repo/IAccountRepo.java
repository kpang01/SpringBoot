package com.PangProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PangProject.entity.AccountEntity;

@Repository
public interface IAccountRepo extends JpaRepository<AccountEntity, Long> {

}