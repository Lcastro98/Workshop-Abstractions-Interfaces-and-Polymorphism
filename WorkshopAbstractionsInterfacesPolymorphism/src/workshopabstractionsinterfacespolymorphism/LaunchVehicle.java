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
    public String power;
    public float payloadCapacity;
    public boolean reusable;

    public LaunchVehicle(String fuel, float payloadCapacity, boolean reusable, String name, Calendar launchDate, float weight, float size, String propeller, float speed, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, speed, activated, location);
        this.fuel = fuel;
        this.payloadCapacity = payloadCapacity;
        this.reusable = reusable;
    }


    
    public void uncoupling() {
    
    }
    
    
    @Override
    public boolean isActivated() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
