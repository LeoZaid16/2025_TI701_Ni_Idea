/*
*
*   ITESS-TICS TInvestigación 1
*   Agosto - Diciembre 2025
*   Proyecto: Ni idea
*   Clase Tutor: Persona interesada en el rendimiendo academico del alumno.
*   Docente: FJMP
*   Programador: Leonardo Zaid Moreno Jimenez
*   Fecha: 02/Octubre/2025
*
*/

package domain;

public class Tutor {
    private int id;
    private String nombre;

    public Tutor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Tutor(){
        
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
