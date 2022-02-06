/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * La clase SpaceProbe define los atributos (características) de una sonda y sus métodos (comportamientos).
 * Extiende se la clase abstracta Spacecraft que contiene los atributos y métodos que comparten todos los tipos de nave e implementa la instancia IUnmannedSpacecraft.
 * @author Lorena Castro
 */
public class SpaceProbe extends Spacecraft implements IUnmannedSpacecraft{
    
    protected float cameraResolution;

    /**
     * Constructor: permite crear una instancia de la clase SpaceProbe.
     * @param cameraResolution
     * @param name
     * @param launchDate
     * @param weight
     * @param size
     * @param propeller
     * @param activated
     * @param location 
     */
    public SpaceProbe(float cameraResolution, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.cameraResolution = cameraResolution;
    }

    /**
     * Constructor con los parametros específicos de la clase.
     * @param cameraResolution 
     */
    public SpaceProbe(float cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    
    
    
    /**
     * Indica cuando la sonda toma la muestra deseada.
     * @return 
     */
    public String takeSample(){
        return "La muestra ha sido tomada satisfactoriamente";
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
        System.out.println("La sonda ha alcanzado su velocidad máxima");
    }

    /**
     * Permite ubicar la sonda en el lugar deseado para tomar la muestra correspondiente.
     */
    @Override
    public void stop() {
        while (speed > 0){
            speed = speed-1;
        }
        System.out.println("La sonda ha llegado a su destino" + takeSample());
    }

    /**
     * Permite notificar el envío satisfactorio de las muestras tomadas.
     * @param send
     * @return 
     */
    @Override
    public String sendInfo(String send) {
        send = "Las imagenes han sido enviadas satisfactoriamente";
        return send;
    }

    /**
     * Permite determinar el destino de la sonda.
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
        return "\nInformación de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + strDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nResolución de cámara: " + cameraResolution + "\n";
    }
}
