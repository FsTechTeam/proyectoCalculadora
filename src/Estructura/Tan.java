/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;
import java.math.*;
/**
 *
 * @author Rosario
 */
public class Tan extends Tiene1Op implements Operacion{
    public Tan(){
        this.Op=0;
    }
    @Override
    public double Operar(){
        
        return Math.tan(this.Op);
    }
}
