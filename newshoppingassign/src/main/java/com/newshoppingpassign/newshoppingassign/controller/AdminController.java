package com.newshoppingpassign.newshoppingassign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newshoppingpassign.newshoppingassign.model.AdminLogin;

import com.newshoppingpassign.newshoppingassign.repository.AdminLogin_Repo;


@Controller
public class AdminController {

    @Autowired
    AdminLogin_Repo Ar;



    //  @PostMapping("/admin_login" )
    // public String adminLogin(AdminLogin Ars)
    // {
    //     Ar.save(Ars);

    //     return "Add_Product";
        
    // }


     @PostMapping("/admin_login")
    public String adminLoginDetails(@RequestParam("admin") String admin, @RequestParam("password") String password, Model model) {
        AdminLogin adminn = Ar.findByAdminAndPassword(admin,password);

        if (adminn != null) {
            return "Add_Product";
        } else {
            
            return "admin";
        }
    }
    
}
