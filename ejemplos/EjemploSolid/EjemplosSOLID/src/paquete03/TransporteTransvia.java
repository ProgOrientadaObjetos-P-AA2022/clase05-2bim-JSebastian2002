/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia {
    
    private String cooperativaTransivia;
    public double tarifa;

    public void establecerTarifa(){
        tarifa = 2 * 0.30;
    }
    
    public void establecerCooperativaTransvia(String c){
        cooperativaTransivia = c;
    }
    public String obtenerCooperativaTransvia(){
        return cooperativaTransivia;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
      
}
