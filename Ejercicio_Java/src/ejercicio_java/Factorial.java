/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java;

/**
 *
 * @author Ericka
 */
public class Factorial {
    int resultado;
    
    public Factorial(int numero){
    
        this.resultado = numero;
    }
    
    public int factorial (int fact){
    
        if(fact < 2){
            this.resultado = 1;
        }else{
            this.resultado = fact *(factorial(fact-1));
        
        }
        return this.resultado;
    }
}
