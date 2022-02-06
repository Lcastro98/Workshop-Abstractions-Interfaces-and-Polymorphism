/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshopabstractionsinterfacespolymorphism;

import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author lcast
 */
public class WorkshopAbstractionsInterfacesPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        int add;
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Por favor indique el tipo de nave que desea crear. Las posibles opciones son: 1. Vehículo Lanzadera; 2. Satelite Artificial; 3. Transporte sin tripulación; 4. Sonda Espacial; 5. Nave Tripulada");
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
                case 1:
                    System.out.println("Por favor indique el tipo de combustible: ");
                    String fuel = s.nextLine();
                    System.out.println("Por favor indique la capacidad de carga útil: ");
                    float payloadCapacity = Float.parseFloat(s.nextLine());
                    System.out.println("Si la nave puede volverse a utilizar digite 1, de lo contrario digite 0: ");
                    int reusable = Integer.parseInt(s.nextLine());
                    
                    LaunchVehicle lv = new LaunchVehicle(fuel, payloadCapacity, (reusable == 0?false:true), name, launchDate, weight, size, propeller, (activated == 0?false:true), location);
                
                case 2:
                    
            }
            System.out.println("Si desea agregar otra nave por favor digite 1, de lo contrario digite 0: ");
            add = Integer.parseInt(s.nextLine());
        }
        while (add != 0);
        System.out.println("");
    }
    
}
