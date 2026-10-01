package com.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaMundoController {

    @GetMapping
    String holaMundo (){
        String saludo = "¡Hola Mundo desde Java y Tomcat!";
        return saludo;
    }

}
