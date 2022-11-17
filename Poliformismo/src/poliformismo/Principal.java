/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo;

/**
 *
 * @author Daniel
 */
public class Principal {
    public static void main(String[] args){
    Vehiculo misVehiculos[] =new Vehiculo[3];
    
    misVehiculos[0]=new Vehiculo("FEV454","SKODA","Forman 1.3i");
    misVehiculos[1]=new Turismo(4,"OSJ237","infinity ","chery yoya");
    misVehiculos[2]=new Deportivo(1497,"PGE264","bmw ","bmw i8");
    
    for(Vehiculo Vehiculos: misVehiculos){
        System.out.println(Vehiculos.Mostradatos());
        System.out.println("");
    
    }
    }
}
