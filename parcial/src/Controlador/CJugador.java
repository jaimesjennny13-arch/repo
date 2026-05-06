/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import Modelo.JugadorDAO;
import Vista.ManejadorPantallas;
import Vista.VJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UIS
 */
public class CJugador implements ActionListener{
    VJugador vista;
    JugadorDAO dao;

    public CJugador(VJugador vista, JugadorDAO dao) {
        this.vista = vista;
        this.dao = dao;
        this.vista.getBtnActualizar().addActionListener(this);
        this.vista.getBtnConsultar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
        this.vista.getBtnGuardar().addActionListener(this);
        this.vista.getBtnJugar().addActionListener(this);
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               ManejadorPantallas.abrirJugador();
            }
            
        });
        llenarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== vista.getBtnActualizar()) {
            actualizar();
        }else if (e.getSource()==vista.getBtnConsultar()) {
            consultar();
        }else if (e.getSource()==vista.getBtnEliminar()) {
            eliminar();
        }else if (e.getSource()==vista.getBtnGuardar()) {
            guardar();
        }else if (e.getSource()==vista.getBtnJugar()) {
            jugar();
        }
            
        }
    private void actualizar (){
        String nombre=vista.getTxtNombre().getText();
        Jugador actualizado= capturarDatos();
        if (dao.actualizar(actualizado)) {
            JOptionPane.showMessageDialog(vista,"jugador actualizado correctamente");
            llenarTabla();
            limpiarCampos();
        }
  
    }
    private void consultar(){
       
    }
    private void eliminar(){
       String nombre=vista.getTxtNombre().getText();
        if (dao.eliminar(nombre)) {
            JOptionPane.showMessageDialog(vista, "jugador eliminado");
            llenarTabla();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR AL ELIMINAR JUGADOR");
        }
            
            
        }
    
    private  void guardar(){
        try {
            Jugador jugador= capturarDatos();
            if (dao.guardar(jugador)) {
                
                llenarTabla();
                limpiarCampos();
            }
        } catch (Exception e) {
        }
        }
    
    private void jugar(){
        String nombre=vista.getTxtNombre().getText();
    }
    public void llenarTabla() {
        DefaultTableModel modelotabla=(DefaultTableModel) vista.getTblJugador().getModel();
        modelotabla.setRowCount(0);
           List<Jugador>listaJugadores=dao.consultarTodos();
           Object[] fila= new Object[5];
           for (Jugador jugadores  : listaJugadores) {
               fila[0]=jugadores.getNombre();
               fila[1]=jugadores.getTelefono();
               fila[2]=jugadores.getEdad();
               fila[3]=jugadores.getSaldo();
               modelotabla.addRow(fila);
               
            
        }
    }
    private Jugador capturarDatos(){
        String nombre= vista.getTxtContraseña().getText();
        String telefono= vista.getTxtEdad().getText();
        String edad= vista.getTxtNombre().getText();
        int  saldo= Integer.parseInt(vista.getTxtSaldo().getText());
       String contraseña = vista.getTxtTelefono().getText();
        Jugador jugador= new Jugador(nombre, telefono, edad, saldo, contraseña);
        return null;
    }
    
    private void limpiarCampos(){
        
        vista.getTxtEdad().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtSaldo().setText("");
        vista.getTxtTelefono().setText("");
    }
    public  void finalizar() {
        this.vista.dispose();;
       this. vista=null; 
       this.dao=null;
        
        System.out.println("Controlador y referencias liberadas");
        
    }
}

