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
public class Calculadora {
 
    public Operacion TipoOperacion;
    private double resultado;
    
    public Calculadora(){
        this.resultado=0;
    }
    
    public void setTipoOperacion (Operacion tipo){
        this.TipoOperacion=tipo;
    }
    
    public void EjecutarOperacion(){
       resultado=this.TipoOperacion.Operar();
    }
    
    public void ImprimirResultado(){
            System.out.println("El resultado es: "+this.resultado);
    }
} 
