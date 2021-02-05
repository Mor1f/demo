package com.example.demo.controllers;

import com.example.demo.domain.Doctor;
import com.example.demo.repos.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GreetingController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/signin")
    public String greeting(Model model) {

        return "signin";
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("doctors", doctorRepository.findAll());
        return "index";
    }
    @GetMapping("/Semenov")
    public String sem(Model model){
        return "Semenov";
    }

   @PostMapping
    public String filter(@RequestParam String specialization, Model model){

        model.addAttribute("doctors", doctorRepository.findBySpecialization(specialization));

        return "index";
   }



}