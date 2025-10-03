package domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testConstructor() {
        Usuario u = new Usuario("Leonardo", "Itess2025", "Leonardo@itess.com");
        assertEquals("Leonardo", u.getUsername());
        assertEquals("Itess2025", u.getPassword());
        assertEquals("Leonardo@itess.com", u.getCorreo());
    }

    @Test
    public void testSetters() {
        Usuario u = new Usuario();  // requiere constructor vacío
        u.setUsername("Mario");
        u.setPassword("Itess2025");
        u.setCorreo("Mario@itess.com");

        assertEquals("Mario", u.getUsername());
        assertEquals("Itess2025", u.getPassword());
        assertEquals("Mario@itess.com", u.getCorreo());
    }
}
