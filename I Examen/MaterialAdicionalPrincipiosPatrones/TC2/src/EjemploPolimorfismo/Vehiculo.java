/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploPolimorfismo;

/**
 *
 * @author Edgardo Quirós
 */
public abstract class Vehiculo {

    private String tipo;
    private String color;
    private int ruedas;

    public Vehiculo(String tipo, String color, int ruedas) {
        this.tipo = tipo;
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public abstract void mostrarVehiculo();

}
