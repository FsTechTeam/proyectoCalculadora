/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author Vader33
 */
public class Division extends Tiene2Op implements Operacion {

    public Division(){
       this.Op1=0;
       this.Op2=0;
    }
  
    @Override
    public double Operar() {
        return (Double.parseDouble(""+this.Op1)/Double.parseDouble(""+this.Op2));
    }

 
    
}
