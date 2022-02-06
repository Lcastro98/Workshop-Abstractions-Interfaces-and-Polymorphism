/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * La clase MannedSpacecraft define los atributos (características) de una nave con tripulación y sus métodos (comportamientos).
 * Extiende se la clase abstracta Spacecraft que contiene los atributos y métodos que comparten todos los tipos de nave.
 * @author Lorena Castro
 */
public class MannedSpacecraft extends Spacecraft {
    
    protected int crewCapacity;

    /**
     * Constructor: permite crear una instancia de la clase MannedSpacecraft.
     * @param crewCapacity
     * @param name
     * @param launchDate
     * @param weight
     * @param size
     * @param propeller
     * @param activated
     * @param location 
     */
    public MannedSpacecraft(int crewCapacity, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.crewCapacity = crewCapacity;
    }

    /**
     * Constructor con los parametros específicos de la clase.
     * @param crewCapacity 
     */
    public MannedSpacecraft(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    /**
     * Método que permite notificar cuando el piloto automático de la nave se desactiva.
     * @return 
     */
    public String desactivateAutopilot(){
        return "El piloto automatico ha sido desactivado, por favor pretarece para tomar el control";
    }

    
    float maxSpeed = 200;
    
    /**
     * Permite aumentar la velocidad de la nave al punto necesario para lograr llegar al destino.
     */
    @Override
    public void launch() {
        while (speed < maxSpeed){
            speed = speed + 1;
        }
        System.out.println("La nave con tripulación ha alcanzado su velocidad máxima");
    }

    /**
     * Permite detener la nave para ubicarse en el destino.
     */
    @Override
    public void stop() {
        while (speed > 0){
            speed = speed-1;
        }
        System.out.println("Ha llegado a su destino");
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la nave de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(launchDate.getTime());
        return "\nInformación de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + strDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nCapacidad de personal: " + crewCapacity + "\n";
    }

}
