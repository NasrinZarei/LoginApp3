package com.example.LoginApp3.repository;


import com.example.LoginApp3.entity.Income;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncomeRepository  extends JpaRepository<Income, Long> {
 public List<Income> findByUserId(int userId);

}
