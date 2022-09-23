/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinni.demospringboot;

import com.vinni.demospringboot.util.Utilidades;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author Vinni@
 */
@SpringBootApplication
@Log4j2
public class DemoSpringApplication {

    //private static final Logger logger = LogManager.getLogger(DemoSpringApplication.class);
    public static void main(String[] args) {
        
        SpringApplication.run(DemoSpringApplication.class, args);
        log.info("Inicio app demo de Spring Boot");
        log.error("Esto es error ");
        try {
            int x = 2/0;
        } catch (Exception e) {
            log.error("Division 0 Antesr",e);
        }
        Utilidades.dividir();
    }

}
