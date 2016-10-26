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
public class SerieNumerica {
    
    int semilla;
    int [] serie;
    
    public SerieNumerica(int length){
        this.semilla = 0;
        this.serie = new int [length];
    }
    
    public void crearSerie () {
        
        for (int i = 0; i < this.serie.length; i++ ){
            if (i == 0)
            {this.serie[i]=1;
            }else if(i%2 == 0){
                this.serie[i] = this.serie[i-1] - 2;
            }else{
                this.serie[i] = this.serie[i-1] + 4;
            }   
        }
    }
    public void mostrarSerie(){
        for (int i = 0; i < this.serie.length; i++ ){
           System.out.println("Posicion ["+i+"]: "+this.serie[i]);
        }
    }
    
}
