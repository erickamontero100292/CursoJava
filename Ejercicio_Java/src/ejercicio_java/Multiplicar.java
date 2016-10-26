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
public class Multiplicar {
    int tabla;
    Multiplicar (int tabla){
        this.tabla = tabla;
    }
    public void tablas (){
        int i = 0;
        //int tabla = 0;
        while(tabla < 11){
            System.out.println("Tabla del " + tabla);
            for(i = 0; i < 11; i++){
                System.out.println(tabla + "*"+ i + "="+ (tabla*i));
            }
            System.out.println("---------------------");
             tabla++;
        }
    }
    public void tablas2 (){
        int i = 0;
        int j = 0;
        //int tabla = 0;
        for(j = 0; j < 11; j++){
            System.out.println("---------------------");
            System.out.println("Tabla del " + j);
            for(i = 0; i < 11; i++){
                System.out.println(j + "*"+ i + "="+ (j*i));
            }
            
             tabla++;
        }
    }
    
}
