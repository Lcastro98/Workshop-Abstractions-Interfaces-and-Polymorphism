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
public class MannedSpacecraft extends Spacecraft {
    
    public int crewCapacity;

    public MannedSpacecraft(int crewCapacity, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.crewCapacity = crewCapacity;
    }

    public void desactivateAutopilot(){
    }

    @Override
    public void launch() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(launchDate.getTime());
        return "Información de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + strDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nCapacidad de personal: " + crewCapacity + "\n";
    }

}
