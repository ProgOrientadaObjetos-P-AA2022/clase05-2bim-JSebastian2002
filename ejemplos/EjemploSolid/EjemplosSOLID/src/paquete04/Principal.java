/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransivia transvia = new TransporteTransivia();
        transvia.establecerCooperativaTaxi("La Pradera");
        transvia.establecerTarifa();
        
        
        ArrayList<Transporte> listado = new ArrayList<>();
        TiposTransporte tipos = new TiposTransporte();    
        
        listado.add(bus);
        listado.add(taxi);
        listado.add(transvia);
        tipos.establecerTransportes(listado);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
