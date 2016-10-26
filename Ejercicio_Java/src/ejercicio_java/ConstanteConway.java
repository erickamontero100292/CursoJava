/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_java;
import java.util.*;
/**
 *
// * @author Ericka
 */
public class ConstanteConway {
    
    
    public void serie (){
        int serie = 5;
        int cantidad ;
        String cadena;
        int digito;
        int numero =1; 
        int posicion ;
        serie--;
        for(;serie>0;serie--){
            cadena= "";
            cadena = Integer.toString(numero);
//            System.out.println(cadena);
            for(posicion = 0; posicion<cadena.length();){
                digito = (cadena.charAt(posicion))-48;
                cantidad =0;
                
                while(digito == (cadena.charAt(posicion))-48){
                    posicion++;
                    cantidad++;
                    if(posicion >= cadena.length()) {break;}
                }
                cadena = cadena.concat(Integer.toString(cantidad)+Integer.toString(digito));
                //System.out.println(cadena);
            }
            
            System.out.println(cadena);
            numero = Integer.parseInt(cadena);
        }
//        String[] str_Arr=(String[])this.conway.toArray();
//        
       // System.out.println(this.conway);
////        System.out.println((this.conway.size()-1));
    }
    
}
