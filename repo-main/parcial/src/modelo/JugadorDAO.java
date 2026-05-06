/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UIS
 */
public class JugadorDAO {
    private List<Jugador>listaJugadores= new ArrayList<>();
    public boolean crearJugador(String nombre, String telefono, String edad, int saldo, String contraseña) {
        Jugador jugadores=new Jugador(nombre, telefono, edad, saldo, contraseña);
        return listaJugadores.add(jugadores);
    }
    public boolean guardar(Jugador jugador) {
        try {
              return listaJugadores.add(jugador);
        } catch (Exception e) {
            System.err.println("error a guardar");
            return false;
        }
        
    }
    public List<Jugador> consultarTodos() {
        return listaJugadores;
        
    }
    
    public Jugador buscarpornombre(String nombre) {
        for (Jugador jugador : listaJugadores) {
            if (jugador.getNombre().equals(nombre)) {
                return jugador;
            }
            
        }
        return null;
    }
     public boolean actualizar(Jugador actualizar) {
        for (int i = 0; i < listaJugadores.size(); i++) {
            if (listaJugadores.get(i).getNombre().equalsIgnoreCase(actualizar.getNombre())) {
                listaJugadores.set(i, actualizar);
                return true;
            }
           
        }
        return false;
    }
     public boolean eliminar(String nombre) {
         for (int i = 0; i < listaJugadores.size(); i++) {
             if (listaJugadores.get(i).getNombre().equals(nombre)) {
                  listaJugadores.remove(i);
                  return true;
             }
             
         }
       return false;
    }
    
    }

