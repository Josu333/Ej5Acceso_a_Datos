/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.josue.esteban;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dam
 */
public class Ejercicio3JosueEsteban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("..\\Ejercicio3.Josue.Esteban\\NUEVODIR");
        File archivo1 = new File ("..\\Ejercicio3.Josue.Esteban\\NUEVODIR\\FICHERO1.txt");
        //o File archivo1 = new FIle (f, "FICHERO1.txt");
        File archivo2 = new File ("..\\Ejercicio3.Josue.Esteban\\NUEVODIR\\FICHERO2.txt");
        File rename1 = new File ("..\\Ejercicio3.Josue.Esteban\\NUEVODIR\\FICHERO1NUEVO.txt");
        
        if (!f.exists()) {
            try {
                if (f.mkdir()) {//crea un directorio -si no existe-
                    System.out.println("Directorio creado con exito!");
                }
            }catch(Exception ex){
                System.out.println("Error al crear el directorio");
            }

        }else{
            System.out.println("El directorio ya existe");
        }
        
        if(!archivo1.exists()){           
        try {
            
            archivo1.createNewFile();
            
            if(archivo1.exists() ){
                System.out.println("FICHERO1.txt creado con exito");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            ioe.printStackTrace(System.err);
            //System.out.println("NO se he podido crear el FICHERO1.txt");
        }
        }else{
            System.out.println("EL ARCHIVO FICHERO1.txt YA EXISTE");
        }
        
         if(!archivo2.exists()){   
        try{
            archivo2.createNewFile();
            if(archivo2.exists()){
                System.out.println("FICHERO2.txt creado con éxito");
            }
        }catch(Exception ex2){
            System.out.println("NO se he podido crear el FICHERO2.txt");
        }
         }else{
             System.out.println("EL ARCHIVO FICHERO2.txt YA EXISTE");
         }
        
        boolean renombre = archivo1.renameTo(rename1);
        if(renombre){
            System.out.println("Se ha renombrado ARCHIVO1.txt a ARCHIVO1NUEVO.txt");
        }
        
        archivo2.delete();
        if(!archivo2.exists()){
            System.out.println("FICHERO2.txt HA SIDO BORRADO!");
        }
    }

}
