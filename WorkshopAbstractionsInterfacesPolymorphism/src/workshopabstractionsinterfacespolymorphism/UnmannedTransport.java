/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * La clase UnmannedTransport define los atributos (características) de una nave de transporte y sus métodos (comportamientos).
 * Extiende se la clase abstracta Spacecraft que contiene los atributos y métodos que comparten todos los tipos de nave e implementa la instancia IUnmannedSpacecraft.
 * @author Lorena Castro
 */
public class UnmannedTransport extends Spacecraft implements IUnmannedSpacecraft {
    
    public float loadCapacity;

    /**
     * Constructor: permite crear una instancia de la clase UnmannedTransport.
     * @param loadCapacity
     * @param name
     * @param launchDate
     * @param weight
     * @param size
     * @param propeller
     * @param activated
     * @param location 
     */
    public UnmannedTransport(float loadCapacity, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.loadCapacity = loadCapacity;
    }

    /**
     * Método que permite indicar cuando la nave transportadora se acopla en el lugar deseado.
     * @return 
     */
    public String coupling(){
        return "El acoplamiento de la nave ha sido exitoso";
    }

    float maxSpeed = 200;
    
    /**
     * Permite aumentar la velocidad al punto necesario para lograr llegar al destino.
     */
    @Override
    public void launch() {
        while (speed < maxSpeed){
            speed = speed + 1;
        }
        System.out.println("La nave de transporte ha alcanzado su velocidad máxima");
    }

    /**
     * Permite detener la nave para acoplarla en el lugar correspondiente.
     */
    @Override
    public void stop() {
        while (speed > 0){
            speed = speed-1;
        }
        System.out.println(coupling());
    }

    /**
     * Permite notificar la entrega satisfactoria de la carga.
     * @param send
     * @return 
     */
    @Override
    public String sendInfo(String send) {
        send = "La carga se ha entregado satisfactorimente";
        return send;
    }

    /**
     * Permite determinar el destino de la nave de transporte.
     * @param destination
     * @return 
     */
    @Override
    public String defineRoute(String destination) {
        return destination;
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la nave de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(launchDate.getTime());
        return "Información de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + strDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nCapacidad de carga: " + loadCapacity + "\n";
    }
    
}
