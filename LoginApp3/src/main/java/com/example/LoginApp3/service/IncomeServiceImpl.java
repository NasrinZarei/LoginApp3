package com.example.LoginApp3.service;



import com.example.LoginApp3.entity.Income;
import com.example.LoginApp3.repository.IncomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeServiceImpl implements IncomeService {

    private final IncomeRepository incomeRepository;

    public IncomeServiceImpl(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }


    @Override
    public List<Income> getAllIncomes(Integer userId) {

        return  incomeRepository.findByUserId(userId);
    }

    @Override
    public void saveIncome(Income income) {
        this.incomeRepository.save(income);
    }

    @Override
    public Income getIncomeById(long id) {
        Optional< Income > optional = incomeRepository.findById(id);
        Income income = null;
        if (optional.isPresent()) {
            income = optional.get();
        } else {
            throw new RuntimeException(" Income not found for id :: " + id);
        }
        return income;
    }

    @Override
    public void deleteIncomeById(long id) {
        this.incomeRepository.deleteById(id);
    }

//    @Override
//    public List<Income> findByUserId(Integer userId) {
//        return (List<Income>) incomeRepository.findByUserId(userId);
//    }


}
