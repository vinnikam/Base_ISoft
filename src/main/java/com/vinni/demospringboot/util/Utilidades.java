/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinni.demospringboot.util;

import lombok.extern.log4j.Log4j2;

/**
 *
 * @author Vinni@
 */
@Log4j2
public class Utilidades {
    //private static final Logger log = LogManager.getLogger(Utilidades.class);
    public static void dividir (){
        try {
            int a = 2/0;
        } catch (Exception e) {
            log.error("Dividir 0", e);
        }
    }
    
}
