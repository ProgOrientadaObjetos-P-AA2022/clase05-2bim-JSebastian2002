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
  
public class ArchivoLecturaPeliculas {
    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> generador;
    private String nombreArchivo;

    public ArchivoLecturaPeliculas(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try 
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            }
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } 
        }
    }
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    
    public void establecerPeliculas() {
        
         generador = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    GeneradorPeliculas registro = (GeneradorPeliculas) entrada.readObject();
                     generador.add(registro);
                } catch (EOFException endOfFileException) {
                    return; 
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<GeneradorPeliculas> obtenerPeliculas() {
        return  generador;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Peliculas\n";
        for (int i = 0; i < obtenerPeliculas().size(); i++) {
            GeneradorPeliculas p = obtenerPeliculas().get(i);
            cadena = String.format("%s\n%s", cadena,  generador.get(i).obtenerUrl());
        }

        return cadena;
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
}