/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UIS
 */
public class Masculino {
    String nombre;
    String genero;

    public Masculino(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Masculino{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
    
}
