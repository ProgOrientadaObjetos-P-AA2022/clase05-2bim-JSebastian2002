/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma +  e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }

     @Override
    public String toString() {
        String reporte = ("Operaciones Estudiante\n");
        for (int i = 0; i < estudiantes.size(); i++){
            reporte = String.format("%sEstudiante: %s\n",reporte,
            obtenerEstudiante().get(i).obtenerNombre());
    }
        
        reporte = String.format("%sPromedio Edades: %s\n"
                ,reporte,
                obtenerPromedioEdades());
        return reporte;

    }
        }