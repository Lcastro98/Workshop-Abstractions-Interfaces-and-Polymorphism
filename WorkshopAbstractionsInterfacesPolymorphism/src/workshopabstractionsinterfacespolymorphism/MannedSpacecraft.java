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
public class MannedSpacecraft extends Spacecraft {
    
    public int crewCapacity;

    public MannedSpacecraft(int crewCapacity, String name, Calendar launchDate, float weight, float size, String propeller, float speed, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, speed, activated, location);
        this.crewCapacity = crewCapacity;
    }

    public void desactivateAutopilot(){
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
