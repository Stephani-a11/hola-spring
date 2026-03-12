/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.hola_spring;

/**
 *
 * @author ste
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hola")
    public String decirHola(
            @RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        return String.format("¡Hola %s! Bienvenido a tu primera app con Spring Boot.", nombre);
    }

    @GetMapping("/")
    public String inicio() {
        return "La aplicación está funcionando. Prueba el endpoint /api/hola?nombre=TuNombre";
    }
}