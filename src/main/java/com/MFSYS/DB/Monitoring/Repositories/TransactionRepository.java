package com.MFSYS.DB.Monitoring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MFSYS.DB.Monitoring.Entities.TransactionType;

public interface TransactionRepository<T extends TransactionType, ID> extends JpaRepository<T, ID> {

}
