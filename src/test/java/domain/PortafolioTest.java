package domain;

/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase PortafolioTest: Clase test de la clase PortafolioTest, utilizando junit.
*   Docente: FJMP
*   Programador: Leonardo Zaid Moreno Jimenez
*   Fecha: 02/Octubre/2025
*
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PortafolioTest {

    @Test
    public void testConstructor() {
        Portafolio p = new Portafolio(1, "Portafolio Leonardo");
        assertEquals(1, p.getId());
        assertEquals("Portafolio Leonardo", p.getDescripcion());
    }

    @Test
    public void testSetters() {
        Portafolio p = new Portafolio();
        p.setId(2);
        p.setDescripcion("Portafolio Mario");        
        
        assertEquals(2, p.getId());
        assertEquals("Portafolio Mario", p.getDescripcion());        
    }
}
