/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_animal;

/**
 *
 * @author Emmanuel Zapata
 */
public abstract class Conejo extends Proyecto_Animal {
    
    public Conejo(String nombre, String Tipo_alimentacion, int edad) {
        super(nombre, Tipo_alimentacion, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de sacate");
    }

    @Override
    public void corre() {
        System.out.println("corro con mis 4 patitas");   
    }
    
}
