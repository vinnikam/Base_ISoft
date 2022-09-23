/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoSpringTest;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vinni@
 */
public class PruebasTest {
@Test
    public void TestEjemploNull(){
        Faker faker = new Faker();
        String nombre = faker.name().name();
        
        assertFalse(nombre.length()==0);
        
    }    
}
