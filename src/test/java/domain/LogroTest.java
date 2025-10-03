package domain;

/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase LogroTest: Clase test de la clase LogroTest, utilizando junit.
*   Docente: FJMP
*   Programador: Leonardo Zaid Moreno Jimenez
*   Fecha: 02/Octubre/2025
*
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LogroTest {

    @Test
    public void testConstructor() {
        Logro l = new Logro(1, "Proyecto Ni idea", "Java");
        assertEquals(1, l.getId());
        assertEquals("Proyecto Ni idea", l.getDescripcion());
        assertEquals("Java", l.getCategoria());
    }

    @Test
    public void testSetters() {
        Logro l = new Logro();
        l.setId(2);
        l.setDescripcion("Proyecto Series de Fourier");
        l.setCategoria("Java");
        
        assertEquals(2, l.getDescripcion());
        assertEquals("Proyecto Series de Fourier", l.getDescripcion());
        assertEquals("Java", l.getCategoria());
    }
}
