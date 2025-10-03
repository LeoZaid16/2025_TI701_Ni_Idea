/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase Coordinador: Interesado en el rendimiento general del grupo TI701.
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
public class Coordinador {
    private String nombre;
    private String area;

    public Coordinador(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }
    
    public Coordinador(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
        
}
