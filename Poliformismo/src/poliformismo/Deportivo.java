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
public class Deportivo extends  Vehiculo{
    private int cilindraje;
    
    
    
    public Deportivo (int cilindraje,String matricula,String marca,String modelo){
            
    super(matricula, marca, modelo);
    this.cilindraje=cilindraje;
    
    }
    
    
    public int getcilindraje(){
    return cilindraje;
    }
    @Override
    public String Mostradatos(){
    return "matricula: "+matricula+"\nmarca: "+marca+"\nmodelo: "+modelo+
        "\nCilindraje del vehiculo: "+cilindraje;
        
        }
}
