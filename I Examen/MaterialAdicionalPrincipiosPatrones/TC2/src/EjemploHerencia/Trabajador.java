/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploHerencia;

/**
 *
 * @author Edgardo Quirós
 */
public class Trabajador extends Persona {

    private String profesion;

    public Trabajador(String nombre, String apellido, int edad, String profesion) {
        super(nombre, apellido, edad);
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nprofesion=" + profesion;
    }

}
