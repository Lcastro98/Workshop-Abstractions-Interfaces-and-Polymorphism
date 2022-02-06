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
public class SpaceProbe extends Spacecraft implements IUnmannedSpacecraft{
    
    public float cameraResolution;

    public SpaceProbe(float cameraResolution, String name, Calendar launchDate, float weight, float size, String propeller, boolean activated, String location) {
        super(name, launchDate, weight, size, propeller, activated, location);
        this.cameraResolution = cameraResolution;
    }
    
    public String takeSample(){
        return "La muestra ha sido tomada satisfactoriamente";
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
        send = "Las imagenes han sido enviadas satisfactoriamente";
        return send;
    }

    @Override
    public String defineRoute(String destination) {
        return destination;
    }
  
    @Override
    public String toString() {
        return "Información de la nave:\nNombre: " + name + "\nFecha de lanzamiento: " + launchDate + "\nPeso: " + weight + "\nTamaño: " + size + "\nSistema de propulsión: " + propeller + "\nVelocidad: " + speed + "\n¿Está activa?: " + (activated==true?"Sí":"No") + "\nUbicación:" + location + "\nResolución de cámara: " + cameraResolution + "\n";
    }
}
