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
public abstract class Spacecraft {
    
    public String name;
    public Calendar launchDate;
    public float weight;
    public float size;
    public String propeller;
    public float speed;
    public boolean activated;
    public String location;

    public Spacecraft(String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        this.name = name;
        this.launchDate = launchDate;
        this.weight = weight;
        this.size = size;
        this.propeller = propeller;
        this.speed = 0;
        this.activated = activated;
        this.location = location;
    }

    public boolean isActivated() {
        return activated;
    }
    public abstract void launch();
    public abstract void stop();
  
}
