package com.example.LoginApp3.service;



import com.example.LoginApp3.entity.Income;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IncomeService {
    List<Income> getAllIncomes(Integer userId);
    void saveIncome(Income income);
    Income getIncomeById(long id);
    void deleteIncomeById(long id);
}
