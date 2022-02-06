/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.util.Calendar;

/**
 *
 * @author lcast
 */
public class LaunchVehicle extends Spacecraft{

    public String fuel;
    public float payloadCapacity;
    public boolean reusable;

    public LaunchVehicle(String fuel, float payloadCapacity, boolean reusable, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.fuel = fuel;
        this.payloadCapacity = payloadCapacity;
        this.reusable = reusable;
    }
    
    public String uncopling(){
        return "El vehiculo lanzadera se ha desacoplado satisfactoriamente de la carga útil";
    }

    @Override
    public void launch() {
        speed = speed + 1;
    }

    @Override
    public void stop() {
        speed = 0;
    }
    
}
