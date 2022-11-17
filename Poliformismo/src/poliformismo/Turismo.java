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
public class Turismo extends  Vehiculo{
    private int nPuertas;
    
    
    public Turismo(int nPuertas,String matricula,String marca,String modelo){
    
    super(matricula, marca, modelo);
    this.nPuertas=nPuertas;
    }
    
    
    public int getnPuertas(){
    return nPuertas;
    }
    @Override
    public String Mostradatos(){
    return "matricula: "+matricula+"\nmarca: "+marca+"\nmodelo: "+modelo+
        "\nNumero de puertas: "+nPuertas;
        
        }
}
