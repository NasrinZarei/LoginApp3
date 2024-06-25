package com.example.LoginApp3.controller;

import com.example.LoginApp3.entity.Income;
import com.example.LoginApp3.entity.SignUser;
import com.example.LoginApp3.entity.User;
import com.example.LoginApp3.service.IncomeService;
import com.example.LoginApp3.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    @Autowired
    UserService userService;
    @Autowired
    IncomeService incomeService ;

    // display user
    @GetMapping("/register")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user",user);

        return "register_form";
    }
    @PostMapping("/register")
    public User submitForm(@ModelAttribute("user")User user){
        System.out.println(user.getEmail());
        //  User checkUser = userService.findOneByEmailAndPassword(email, password);
//        if( user.getEmail()!= null || user.getEmail().equals(checkUser.getEmail())) {
//            System.out.println("your email is duplicate or null");
//        }

        return  userService.create(user);
    }
    @GetMapping("/login")
    public String showSignForm(Model model){
        SignUser signUser = new SignUser();
        model.addAttribute("signUser",signUser);
        return"sign_form";
    }


    @PostMapping("/login")
    public String loginForm(@RequestParam String email, String password, HttpSession session){
//        User checkUserLogin = userService.findOneByEmailAndPassword(email, password);
//        System.out.println(checkUserLogin.getId());
//        if (checkUserLogin != null) {
//
//            return "sign_plane";
        User checkUserLogin = userService.findOneByEmailAndPassword(email, password);
        if (checkUserLogin != null) {
            session.setAttribute("userId", checkUserLogin.getId());
            return "sign_plane";

        }
        System.out.println("---1111------"+ checkUserLogin);
        return"message";


    }

    // display list of incomes
    @GetMapping("/income")
    public String viewHomePage(HttpSession session,Model model) {
        Integer userId = (Integer) session.getAttribute("userId");
        model.addAttribute("listIncomes", incomeService.getAllIncomes(userId));
        return "income_index";
    }

    @GetMapping("/showNewIncomeForm")
    public String showNewIncomeForm(Model model) {
        // create model attribute to bind form data
        Income income = new Income();
        model.addAttribute("income", income);
        return "new_income";
    }

    @PostMapping("/saveIncome")
    public String saveIncome(@ModelAttribute("income") Income income) {
        // save income to database

        incomeService.saveIncome(income);
        return "redirect:/income";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get income from the service
        Income income = incomeService.getIncomeById(id);

        // set income as a model attribute to pre-populate the form
        model.addAttribute("income", income);
        return "update_income";
    }

    @GetMapping("/deleteIncome/{id}")
    public String deleteIncome(@PathVariable(value = "id") long id) {

        // call delete income method
        this.incomeService.deleteIncomeById(id);
        return "redirect:/income";
    }
}
