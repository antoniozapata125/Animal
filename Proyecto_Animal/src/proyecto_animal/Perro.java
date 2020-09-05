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
public abstract class Perro extends Proyecto_Animal {
    
    public Perro(String nombre, String Tipo_alimentacion, int edad) {
        super(nombre, Tipo_alimentacion, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de Concentrado Dog Chow  ");   
    }

    @Override
    public void corre() {
        System.out.println(" Corro con mis 4 patitas");}
    
}
