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
public class Matrices_Estructura {
    
    
    private String productos[][] = new String [2][3];
    
    public  Matrices_Estructura () {
        productos[0][0] = "Producto 1";
        productos[0][1] = "2";//cantidad
        productos[0][2] = "15.80"; //precio   
        productos[1][0] = "Producto 2";
        productos[1][1] = "4.5";
        productos[1][2] = "36";  
        
    }
    
    public void mejorProducto(){
            
        
            String mejorProducto ="";
            float precio1 = Float.parseFloat(productos[0][2]); 
            float precio2 = Float.parseFloat(productos[1][2]); 
            float cantidad1 = Float.parseFloat(productos[0][1]);
            float cantidad2 = Float.parseFloat(productos[1][1]);
            
            float relacion1 = 0;
            float relacion2 = 0;
            
            relacion1 = precio1/cantidad1;
            relacion2 = precio2 /cantidad2;
            
            String resultado = "";
            if(relacion1<relacion2){resultado="El producto 1 es mejor en relacion precio/valor";}
                else if (relacion1==relacion2){resultado="Tienen la misma relacion precio/valor";}
                else {resultado="El producto 2 es mejor en relacion precio/valor";}
            System.out.println(resultado);
            
    
    }
    
    
}
