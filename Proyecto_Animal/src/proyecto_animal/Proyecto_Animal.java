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
public abstract class Proyecto_Animal {
    private String nombre;
    private String Tipo_alimentacion;
    private int edad;
    
    public Proyecto_Animal (String nombre, String Tipo_alimentacion, int edad){
        this.nombre= nombre;
        this.Tipo_alimentacion = Tipo_alimentacion;
        this.edad = edad;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return Tipo_alimentacion;
    }

    public void setTipo_alimentacion(String Tipo_alimentacion) {
        this.Tipo_alimentacion = Tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public abstract void alimentarse();
    
    public abstract void corre ();
}
