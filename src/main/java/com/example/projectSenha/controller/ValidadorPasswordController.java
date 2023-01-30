package com.example.projectSenha.controller;

import com.example.projectSenha.Patterns;
import com.example.projectSenha.service.SenhaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidadorPasswordController {

    @Autowired
    SenhaService service;
    @GetMapping("/valida")
    @ApiOperation("Metodo para validar uma senha")
    public boolean valida(@RequestParam(value = "senha") String senha) {
        return service.validar(senha, Patterns.pattern1);
    }
}
