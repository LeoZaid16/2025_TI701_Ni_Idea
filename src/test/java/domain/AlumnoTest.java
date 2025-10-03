package domain;

/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase AlumnoTest: Clase test de la clase Alumno, utilizando junit.
*   Docente: FJMP
*   Programador: Leonardo Zaid Moreno Jimenez
*   Fecha: 02/Octubre/2025
*
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

    @Test
    public void testConstructor() {
        Alumno a = new Alumno("TI22110152", "Leonardo");
        assertEquals("TI22110152", a.getNumControl());
        assertEquals("Leonardo", a.getNombre());        
    }

    @Test
    public void testSetters() {
        Alumno a = new Alumno();
        a.setNumControl("TI22110136");        
        a.setNombre("Mario");

        assertEquals("TI22110136", a.getNumControl());
        assertEquals("Mario", a.getNombre());        
    }
}
