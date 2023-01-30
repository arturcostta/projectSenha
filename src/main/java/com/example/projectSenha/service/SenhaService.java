package com.example.projectSenha.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SenhaService {

    public boolean validar(String password, String pattern) {
        return validarRepetido(password) && password.matches(pattern);
    }

    //metodo para validar repeticao
    private boolean validarRepetido(String password) {
        List<Character> listaCaracteres = new ArrayList<Character>();
        for (char c : password.toCharArray()) {
            if(!listaCaracteres.contains(c)) {
                listaCaracteres.add(c);
            }else{
                return false;
            }
        }
        return true;
    }
}
