package com.example.demo.controllers;


import com.example.demo.domain.User;
import com.example.demo.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/register")
public class RegisterController {


    @Autowired
    private UserService userService;

    @GetMapping
    public String register(){
        return "Register";
    }

    @PostMapping("/registersucces")
    public String Register(@ModelAttribute("user") User user){
        System.out.println(user);

        PasswordEncoder crypt = new BCryptPasswordEncoder();
        user.setPassword(crypt.encode(user.getPassword()));
        userService.save(user);
        System.out.println("Registration succeded!");
        return "welcome";
    }
}
