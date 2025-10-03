package domain;

/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase TutorTest: Clase test de la clase TutorTest, utilizando junit.
*   Docente: FJMP
*   Programador: Leonardo Zaid Moreno Jimenez
*   Fecha: 02/Octubre/2025
*
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TutorTest {

    @Test
    public void testConstructor() {
        Tutor t = new Tutor(1, "Jorge");
        assertEquals(1, t.getId());
        assertEquals("Jorge", t.getNombre());
    }

    @Test
    public void testSetters() {
        Tutor t = new Tutor();
        t.setId(2);
        t.setNombre("Luna");        
        
        assertEquals(2, t.getId());
        assertEquals("Luna", t.getNombre());        
    }
}
