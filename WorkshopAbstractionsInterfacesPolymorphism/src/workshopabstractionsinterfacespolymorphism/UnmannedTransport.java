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
public class UnmannedTransport extends Spacecraft implements IUnmannedSpacecraft {
    
    public float loadCapacity;

    public UnmannedTransport(float loadCapacity, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.loadCapacity = loadCapacity;
    }

    public String coupling(){
        return "El acoplamiento de la nave ha sido exitoso";
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
        send = "La carga se ha entregado satisfactorimente";
        return send;
    }

    @Override
    public String defineRoute(String destination) {
        return destination;
    }



    
}
