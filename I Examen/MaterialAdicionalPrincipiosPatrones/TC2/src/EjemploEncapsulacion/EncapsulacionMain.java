/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjemploEncapsulacion;

/**
 *
 * @author robert
 */
public class EncapsulacionMain {

    public static void main(String[] args) {
      EjemploEncapsulacion accesoDato = new EjemploEncapsulacion();
      accesoDato.setDato(3);
        System.out.println("El valor del dato es: " + accesoDato.getDato());
    }
    
}
