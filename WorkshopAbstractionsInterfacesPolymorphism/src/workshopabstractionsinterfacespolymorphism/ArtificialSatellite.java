/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * La clase ArtificialSatellite define los atributos (características) de un satelite artificial y sus métodos (comportamientos).
 * Extiende se la clase abstracta Spacecraft que contiene los atributos y métodos que comparten todos los tipos de nave e implementa la instancia IUnmannedSpacecraft.
 * @author Lorena Castro
 */
public class ArtificialSatellite extends Spacecraft implements IUnmannedSpacecraft {

    public double orbitalHeight;

    /**
     * Constructor: permite crear una instancia de la clase ArtificialSatelitte.
     * @param orbitalHeight
     * @param name
     * @param launchDate
     * @param weight
     * @param size
     * @param propeller
     * @param activated
     * @param location 
     */
    public ArtificialSatellite(double orbitalHeight, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.orbitalHeight = orbitalHeight;
    }
    
    /**
     * Método que permite indicar cuando el satelite recibe la información requerida.
     * @return 
     */
    public String getInfo(){
        return "La información ha sido recibida";
    }

    double orbita = 0;
    
    /**
     * Permite aumentar la velocidad al punto necesario para llegar a la altura orbital requerida.
     */
    @Override
    public void launch() {
        while(orbita < orbitalHeight){
        speed = speed + 1;
        orbita += orbita;
        }
    }

    /**
     * Permite indicar cuando el satelite esta ubicado en la altura orbital deseada.
     */
    @Override
    public void stop() {
        if (orbita == orbitalHeight){
            System.out.println("El satelite se ha ubicado en en la altura orbital correspondiente");
        }
    }

    /**
     * Permite notificar el envío satisfactorio de la información.
     * @param send
     * @return 
     */
    @Override
    public String sendInfo(String send) {
        send = "La información ha sido enviada";
        return send;
    }

    /**
     * Permite determinar el destino del satelite.
     * @param destination
     * @return 
     */
    @Override
    public String defineRoute(String destination) {
        destination = String.valueOf(orbitalHeight);
        return destination;
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la nave de la manera deseada.
     * @return 
     */
    @Override
    public String toString() { 
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(launchDate.getTime());  
        return "Información de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + strDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nAltura orbital: " + orbitalHeight + "\n";
    }

}
