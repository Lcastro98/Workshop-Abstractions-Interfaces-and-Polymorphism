/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
/**
 * La clase Main permite la creación de las naves y el poder mostrar las creadas luego de finalizar el ciclo.
 * @author Lorena Castro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Spacecraft> SpacecraftList = new ArrayList<>();
        int add;
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Por favor digite el número que corresponde al tipo de nave que desea crear. Las posibles opciones son:\n1. Vehículo Lanzadera.\n2. Satelite Artificial.\n3. Nave de Transporte.\n4. Sonda Espacial.\n5. Nave Tripulada");
            int Spacecraft = Integer.parseInt(s.nextLine());
            System.out.println("Por favor indique el nombre de la nave: ");
            String name = s.nextLine();
            System.out.println("Por favor indique la fecha de lanzamiento de la nave en el formato yyyy-MM-dd: ");
            String lD = s.nextLine();
            String[] l = lD.split("-");
            Calendar launchDate = Calendar.getInstance();
            launchDate.set(Integer.parseInt(l[0]),Integer.parseInt(l[1]), Integer.parseInt(l[2]));
            System.out.println("Por favor indique el peso de la nave: ");
            float weight = Float.parseFloat(s.nextLine());
            System.out.println("Por favor indique el tamaño de la nave: ");
            float size = Float.parseFloat(s.nextLine());
            System.out.println("Por favor indique el sistema de propulsión de la nave: ");
            String propeller = s.nextLine();
            System.out.println("Si la nave se encuentra activa digite 1, de lo contrario digite 0: ");
            int activated = Integer.parseInt(s.nextLine());
            System.out.println("Por favor indique la ubicación actual de la nave: ");
            String location = s.nextLine();
            
            switch(Spacecraft){
                case 1 -> {
                    System.out.println("Por favor indique el tipo de combustible: ");
                    String fuel = s.nextLine();
                    System.out.println("Por favor indique la capacidad de carga útil: ");
                    float payloadCapacity = Float.parseFloat(s.nextLine());
                    System.out.println("Si la nave puede volverse a utilizar digite 1, de lo contrario digite 0: ");
                    int reusable = Integer.parseInt(s.nextLine());
                    
                    LaunchVehicle lv = new LaunchVehicle(fuel, payloadCapacity, (reusable == 0?false:true), name, launchDate, weight, size, propeller, (activated == 0?false:true), location);
                    SpacecraftList.add(lv);
                }
                    
                case 2 -> {
                    System.out.println("Por favor indique la altura orbital: ");
                    double orbitalHeight = Double.parseDouble(s.nextLine());
                    
                    ArtificialSatellite as = new ArtificialSatellite(orbitalHeight, name, launchDate, weight, size, propeller, (activated == 0?false:true), location);
                    SpacecraftList.add(as);
                    
                }
                    
                case 3 -> {
                    System.out.println("Por favor indique la capacidad de carga de la nave: ");
                    float loadCapacity = Float.parseFloat(s.nextLine());
                    
                    UnmannedTransport ut = new UnmannedTransport(loadCapacity, name, launchDate, weight, size, propeller, (activated == 0?false:true), location);
                    SpacecraftList.add(ut);
                }
                    
                case 4 -> {
                    System.out.println("Por favor indique la resolución de la cámara: ");
                    float cameraResolution = Float.parseFloat(s.nextLine());
                    
                    SpaceProbe sp = new SpaceProbe(cameraResolution, name, launchDate, weight, size, propeller, (activated == 0?false:true), location);
                    SpacecraftList.add(sp);
                }
                    
                case 5 -> {
                    System.out.println("Por favor indique la capacidad de personal de la nave: ");
                    int crewCapacity = Integer.parseInt(s.nextLine());
                    
                    MannedSpacecraft ms = new MannedSpacecraft(crewCapacity, name, launchDate, weight, size, propeller, (activated == 0?false:true), location);
                    SpacecraftList.add(ms);
                }
            }
            System.out.println("Si desea agregar otra nave por favor digite 1, de lo contrario digite 0: ");
            add = Integer.parseInt(s.nextLine());
        }
        while (add != 0);
        System.out.println(SpacecraftList);
    }
    
}
