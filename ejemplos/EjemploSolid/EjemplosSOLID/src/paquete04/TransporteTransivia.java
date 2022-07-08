/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
public class TransporteTransivia extends Transporte {
    
    private String cooperativaTaxi;
    
    
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }
    
    
    public void establecerTarifa(){
        tarifa = 0.30 + (0.30*0.5);
    }
    
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
        
    
}
