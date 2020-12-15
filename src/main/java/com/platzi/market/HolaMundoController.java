package com.platzi.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;


@RestController
@RequestMapping("/saludar")



public class HolaMundoController {

    @GetMapping ("/hola")
    public static String saludar(){
        return ("Hola!");
    }

    @GetMapping ("/adios")
    public static String adios(){
        return ("Adios!");
    }

}
