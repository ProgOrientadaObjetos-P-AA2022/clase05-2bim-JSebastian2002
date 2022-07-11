/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class TarjetaCredito {
    private String Nombre;
    private String Codigo;
    private double Cupomaximo;
    
    public TarjetaCredito(String nb, String cd, double cupo){
        Nombre = nb;
        Codigo = cd;
        Cupomaximo = cupo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String n) {
        Nombre = n;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Co) {
        Codigo = Co;
    }

    public double getCupomaximo() {
        return Cupomaximo;
    }

    public void setCupomaximo(double c) {
        Cupomaximo = c;
    }

    @Override
    public String toString() {
    String cadena = String.format("%s %s %.2f",Nombre,Codigo,Cupomaximo);
    return cadena;
    }
    
    
    
}
