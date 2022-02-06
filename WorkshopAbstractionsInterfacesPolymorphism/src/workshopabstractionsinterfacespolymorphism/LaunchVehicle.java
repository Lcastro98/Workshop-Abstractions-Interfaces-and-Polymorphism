/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * La clase LaunchVehicle define los atributos (características) de un vehículo lanzadera y sus métodos (comportamientos).
 * Extiende se la clase abstracta Spacecraft que contiene los atributos y métodos que comparten todos los tipos de nave.
 * @author Lorena Castro
 */
public class LaunchVehicle extends Spacecraft{

    public String fuel;
    public float payloadCapacity;
    public boolean reusable;
        
    /**
     * Constructor: permite crear una instancia de la clase LaunchVehicle.
     * @param fuel
     * @param payloadCapacity
     * @param reusable
     * @param name
     * @param launchDate
     * @param weight
     * @param size
     * @param propeller
     * @param activated
     * @param location 
     */
    public LaunchVehicle(String fuel, float payloadCapacity, boolean reusable, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.fuel = fuel;
        this.payloadCapacity = payloadCapacity;
        this.reusable = reusable;
    }
    
    /**
     * Constructor con los parametros específicos de la clase.
     * @param fuel
     * @param payloadCapacity
     * @param reusable 
     */
    public LaunchVehicle(String fuel, float payloadCapacity, boolean reusable) {
        this.fuel = fuel;
        this.payloadCapacity = payloadCapacity;
        this.reusable = reusable;
    }
    
    /**
     * Indica cuando el vehículo lanzadera se separa de la carga que llevaba.
     * @return 
     */
    public String uncopling(){
        return "El vehiculo lanzadera se ha desacoplado satisfactoriamente de la carga útil";
    }

    float maxSpeed = 200;
    
    /**
     * Permite aumentar la velocidad para lograr un lanzamiento exitoso.
     */
    @Override
    public void launch() {
        while (speed < maxSpeed){
            speed = speed + 1;
        }
        System.out.println("El vehículo lanzadera ha alcanzado su velocidad máxima");
    }

    
    /**
     * Permite detener el vehículo luego de cumplir su objetivo.
     */
    @Override
    public void stop() {
        System.out.println(uncopling());
        while (speed > 0){
            speed = speed-1;
        }
    }
    
    /**
     * Sobreescribe el método toString para mostrar los datos de la nave de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(launchDate.getTime());
        return "\nInformación de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + strDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nCombustible: " + fuel + "\nCapacidad de carga útil: " + payloadCapacity + "\n¿Es reusable?: " + (reusable==true?"Sí":"No") +"\n";
    }
}
