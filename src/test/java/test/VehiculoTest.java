/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import logica.Parqueadero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vinni@
 */
public class VehiculoTest {
    private logica.Parqueadero parqueadero; 
    public VehiculoTest() {
        parqueadero = new Parqueadero();
    }
    @Test
    public void registrarNull(){
        boolean rta = parqueadero.registrarVehiculo(null);
        assertFalse(rta);
        
    }
}
