package org.erskineespaderos.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejadorDeArchivos {
    
    private PrintWriter escritor;
    private BufferedReader lector;

    public ManejadorDeArchivos(String nombre) {
        FileWriter escritorDeArchivo = null;
        
        try{
            escritorDeArchivo = new FileWriter(nombre,true);
        } catch(IOException e){
            System.out.println("Error al escribir archivo");
        }
        escritor = new PrintWriter(escritorDeArchivo,true);
    }
    
    public void escribir(String texto){
        escritor.println(texto); //escribe dentro del archivo
    }
    
    public String leer(String archivo) {
        StringBuffer sb = new StringBuffer();
        
        try{
            lector = new BufferedReader(new FileReader(archivo));
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        String linea;
        
        try{
            while((linea = lector.readLine()) != null){
                    sb.append(linea + "\n");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return sb.toString();
    }
    
    
}
