package com.example.LoginApp3.repository;


import com.example.LoginApp3.entity.Income;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository  extends JpaRepository<Income, Long> {

}
