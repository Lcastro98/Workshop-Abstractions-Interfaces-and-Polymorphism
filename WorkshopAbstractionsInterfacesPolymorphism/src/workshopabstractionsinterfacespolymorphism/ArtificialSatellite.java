/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author lcast
 */
public class ArtificialSatellite extends Spacecraft implements IUnmannedSpacecraft {

    public double orbitalHeight;

    public ArtificialSatellite(double orbitalHeight, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.orbitalHeight = orbitalHeight;
    }
    
    public String getInfo(){
        return "La información ha sido recibida";
    }

    @Override
    public void launch() {
        speed = speed + 1;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public String sendInfo(String send) {
        send = "La información ha sido enviada";
        return send;
    }

    @Override
    public String defineRoute(String destination) {
        return destination;
    }

    @Override
    public String toString() { 
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(launchDate.getTime());  
        return "Información de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + strDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nAltura orbital: " + orbitalHeight + "\n";
    }

}
