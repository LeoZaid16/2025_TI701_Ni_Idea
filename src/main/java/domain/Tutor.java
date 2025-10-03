/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase Logro: Representa las habilidades adquiridas del alumno, mediante evidencias.
*   Docente: FJMP
*   Programador: Leonardo Zaid Moreno Jimenez
*   Fecha: 02/Octubre/2025
*
*/

package domain;

/**
 *
 * @author TICS03
 */
public class Tutor {
    private int id;
    private String nombre;

    public Tutor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}
