/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author UIS
 */
public class Jugador {
    private String nombre;
    private String telefono;
    private String edad;
    private int saldo;
    private String contraseña;
    

    public Jugador(String nombre, String telefono, String edad, int saldo, String contraseña) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.saldo = saldo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = 0;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + ", saldo=" + saldo + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
