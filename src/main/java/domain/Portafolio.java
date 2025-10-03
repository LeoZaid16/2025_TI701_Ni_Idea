/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase Portafolio: Engloba los logros y proyectos realizados por el alumno.
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
public class Portafolio {
    private int id;
    private String descripcion;

    public Portafolio(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public Portafolio(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
      
}
