package domain;

/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase CoordinadorTest: Clase test de la clase Coordinador, utilizando junit.
*   Docente: FJMP
*   Programador: Leonardo Zaid Moreno Jimenez
*   Fecha: 02/Octubre/2025
*
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoordinadorTest {

    @Test
    public void testConstructor() {
        Coordinador c = new Coordinador("Renato", "TICS");
        assertEquals("Renato", c.getNombre());
        assertEquals("TICS", c.getArea());        
    }

    @Test
    public void testSetters() {
        Coordinador c = new Coordinador();
        c.setNombre("Mario");        
        c.setArea("AUTOMOTRIZ");

        assertEquals("Mario", c.getNombre());
        assertEquals("AUTOMOTRIZ", c.getArea());        
    }
}
