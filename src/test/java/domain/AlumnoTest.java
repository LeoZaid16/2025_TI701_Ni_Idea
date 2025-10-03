/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Jupiter.api.Test;

/**
 *
 * @author Leona
 */
public class AlumnoTest {
    @Test
    public void testConstructor(){
        Alumno a = new Alumno("TI22110152", "Leonardo Zaid M");
        assertEquals("TI22110152", a.getNumControl());
        assertEquals("Leonardo Zaid M", a.getNombre());
    }
    
    @Test
    public void testSetters() {
        Alumno a = new Alumno();
        a.setNumControl("TI22110152");
        a.setNombre ("Leonardo Zaid M");
        
        assertEquals("TI22110152", a.getNumControl());
        assertEquals("Leonardo Zaid M", a.getNombre());
    }
}
