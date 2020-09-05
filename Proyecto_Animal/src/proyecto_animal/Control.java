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
public class Control {
   public static void main(String[] args) {
       Perro perro = new Perro ("Boby","carnivoro", 2 ) {};
       
       Conejo conejo = new Conejo ("Cosita","hervivoro", 1 ) {};
       
       perro.alimentarse();
       perro.corre();
       conejo.alimentarse();
       conejo.corre();
    }
    
}
