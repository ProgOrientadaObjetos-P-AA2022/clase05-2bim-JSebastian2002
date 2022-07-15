/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class Principal2 {
    public static void main(String[] args) {
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("456788");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIStarplus api4 = new APIStarplus();
        api4.establecerApiKey("5058799");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4.obtenerUrl());
        
        String nombreArchivo = "ApliPeliculas";
        ArchivoEscrituraPeliculas l = new ArchivoEscrituraPeliculas(nombreArchivo);
        l.establecerRegistro(gp);
        l.establecerSalida();
        l.establecerRegistro(gp2);
        l.establecerSalida();
        l.establecerRegistro(gp3);
        l.establecerSalida();
        l.establecerRegistro(gp4);
        l.establecerSalida();       
        
    }
}