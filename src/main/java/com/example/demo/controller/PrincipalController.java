package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {

    @GetMapping("/saudacao")
    public String ola(){
        return "ola usuário, tudo bem?";
    }

    @GetMapping("/saudacao/{nome}")
    public String ola(@PathVariable String nome){
        return "ola " + nome + " tudo bem?";
    }
}
