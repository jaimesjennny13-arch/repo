/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Femenino;
import modelo.Masculino;

/**
 *
 * @author UIS
 */
public class Parcial {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         ArrayList<Femenino>femeninos=new ArrayList<>();
         ArrayList<Masculino>masculinos=new ArrayList<>();
    
     int opcion=0;
     while (opcion!=5){ 
        System.out.println("ingrese 1. si su genero es femenino y 3.si es masculino");
        System.out.println("1.registrar usuario femenino");
        System.out.println("2.registrar usuario masculino");
        System.out.println("3.lista del genero masculina");
        System.out.println("4.lista del genero femenino");
       System.out.println("5.salir");
      opcion=sc.nextInt();
     
     switch (opcion) {
    case 1:
        generofemenino(femeninos, sc);
        
        break;
    case 2:
         generomasculino(masculinos, sc);
    break;
     case 3:
         listamasculino(masculinos);
         break;
     case 4:
         listafemenina(femeninos);
         break;
     case 5:
         System.out.println("saliendo");
         break;
     }
     }
    }
   public static void generofemenino(ArrayList<Femenino>femeninos,Scanner sc) {
       System.out.println("ingrese su nombre");
       String nom= sc.next();
       System.out.println("ingrese su genero");
       String gen=sc.next();
       
       if (gen.equalsIgnoreCase("F")) {
         Femenino f= new Femenino(nom, gen);
         femeninos.add(f);
           
           
       } else {
           System.out.println("ERROR SOLO SE PERMITE GENERO FEMENINO");
       }
       
   } 
    public static void generomasculino(ArrayList<Masculino>masculinos,Scanner sc) {
        System.out.println("ingrese su nombre");
       String nom= sc.next();
       System.out.println("ingrese su genero");
       String gen=sc.next();
       
        if (gen.equalsIgnoreCase("M")) {
        Masculino m= new Masculino(nom, gen);
        masculinos.add(m);  
            
        } else {
            System.out.println("ERROR SOLO SE PERMITE GENERO MASCULINO");
        }
    }
    public static void listamasculino(ArrayList<Masculino>masculinos) {
        for (Masculino m : masculinos) {
            System.out.println(m);
            
        }
    
        
                
    }
    public static void listafemenina(ArrayList<Femenino>femeninos) {
        for (Femenino f : femeninos) {
            System.out.println(f);
            
        }
    }
}
    
      

  

