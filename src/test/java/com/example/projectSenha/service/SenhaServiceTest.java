package com.example.projectSenha.service;

import com.example.projectSenha.Patterns;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SenhaServiceTest {

    @Autowired
    SenhaService service;
    @Test
    public void deveReprovarSenhaVazio(){
        assertFalse(service.validar("", Patterns.pattern1));
    }

    @Test
    public void deveReprovarSenhaMenorQueNove(){
        assertFalse(service.validar("AbT#9", Patterns.pattern1));
    }
    @Test
    public void deveReprovarEspacoBrancoSenha(){
        assertFalse(service.validar("AbT@9 fok", Patterns.pattern1));
    }

    @Test
    public void deveReprovarCaractereRepetidoSenha(){
        assertFalse(service.validar("AbTp9!fokA", Patterns.pattern1));
    }

    @Test
    public void deveReprovarSenhaSemCaractereEspecial(){
        assertFalse(service.validar("AbTp9WfokA", Patterns.pattern1));
    }

    @Test
    public void deveReprovarSenhaSemNumero(){
        assertFalse(service.validar("AbTp#WfokA", Patterns.pattern1));
    }

    @Test
    public void deveReprovarSenhaSemLetra(){
        assertFalse(service.validar("234!#@$79", Patterns.pattern1));
    }

    @Test
    public void deveAprovarSenha(){
        assertTrue(service.validar("AbTp9!fok", Patterns.pattern1));
    }

}
