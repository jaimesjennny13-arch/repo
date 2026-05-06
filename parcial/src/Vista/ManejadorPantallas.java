/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.CJugador;
import Modelo.JugadorDAO;

/**
 *
 * @author UIS
 */
public class ManejadorPantallas {
   
    public static void abrirJugador() {
    VJugador vista=new VJugador();
    JugadorDAO dao=new JugadorDAO();
    CJugador controlador =new CJugador(vista, dao);
    vista.setVisible(true);
    vista.setLocationRelativeTo(vista);
    vista.setTitle("");
    }
    public static void cerrarJugadores(CJugador controlador) {
        if (controlador!=null) {
            controlador=null;
            controlador.finalizar();
            
            
        }
        
        
    }
}
