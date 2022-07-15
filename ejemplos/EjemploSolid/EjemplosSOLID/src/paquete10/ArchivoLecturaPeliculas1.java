/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *
 * @author SALA I
 */
  
public class ArchivoLecturaPeliculas1 {
    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> generador;
    private String nombreArchivo;

    public ArchivoLecturaPeliculas1(String n) {
       nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try 
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } 
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            }
        }
    }
    public void cerrarArchivo() {
        try 
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } 
    } 

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
        public ArrayList<GeneradorPeliculas> obtenerGenerador() {
        return generador;
    }
    public void establecerGenerador(){
        generador= new ArrayList<>();   
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    GeneradorPeliculas registro =(GeneradorPeliculas)entrada.readObject();
                    generador.add(registro);
                } catch (EOFException endOfFileException) {
                    return; 
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    break;
                }
            }
        }
        
    }

}