/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.util.Calendar;

/**
 * La clase abstracta Spacecraft define los atributo (caracteristicas) y métodos (comportamientos) que comparten los diferentes tipos de nave.
 * @author Lorena Castro
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

    /**
     * Constructor vacío.
     */
    public Spacecraft() {
    }
    
    /**
     * Constructor: permite crear una instancia de la clase Spacecraft de acuerdo a los parametros estipulados.
     * @param name
     * @param launchDate
     * @param weight
     * @param size
     * @param propeller
     * @param activated
     * @param location 
     */
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

    /**
     * Método que permite determinar si la nave se encuentra activa o no.
     * @return 
     */
    public boolean isActivated() {
        return activated;
    }
    
    /**
     * Métodos abstractos de la clase abstracta Spacecraft.
     */
    public abstract void launch();
    public abstract void stop();
  
}
