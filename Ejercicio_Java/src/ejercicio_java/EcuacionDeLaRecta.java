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
public class EcuacionDeLaRecta {
    
    float x1=3;
    float y1= 2;
    float x2=-1;
    float y2=-2;

    public EcuacionDeLaRecta() {
    }
    
    public void ecuacion(float x1, float y1,float x2, float y2){
        System.out.println("hola");
        float m = (y2-y1)/(x2-x1);
        x1 = m *(-x1);
        float b = x1 + y1;
        if(m==0){
               System.out.println("y= "+b);
        }else{
            if(m == 1){
                if(b >0){
                    if(m > 0){
                        System.out.println("y= x+"+b);
                    }else{
                        System.out.println("y= -x+"+b);
                    }
                }else{
                    if(m>0){
                        System.out.println("y= x"+b);
                    }else{
                        System.out.println("y= -x"+b);
                    }
                }
            }else{
                if(b>0){
                    if(m>0){
                        System.out.println("y="+m+"x+"+b);
                    }else{
                        System.out.println("y="+m+" x+"+b);
                    }
                }else{
                    if(m>0){
                        System.out.println("y="+m+" x"+b);
                    }else{
                        System.out.println("y="+m+" x"+b);
                    }

                }

            }
        }
    
    }
          
       
    public void ecuacion2(float x1, float y1,float x2, float y2){
        
        float m = (y2-y1)/(x2-x1);
        x1 = m *(-x1);
        float b = x1 + y1;
        if(m==0){
               System.out.println("y= "+b);
        }else{
            
           
            if(m == 1){
                if(b >0){
                    if(m > 0){
                        System.out.println("y= x+"+b);
                    }else{
                        System.out.println("y= -x+"+b);
                    }
                }else{
                    if(m>0){
                        System.out.println("y= x"+b);
                    }else{
                        System.out.println("y= -x"+b);
                    }
                }
            }else{
                if(b>0){
                    if(m>0){
                        System.out.println("y="+m+"x+"+b);
                    }else{
                        System.out.println("y="+m+" x+"+b);
                    }
                }else{
                    if(m>0){
                        System.out.println("y="+m+" x"+b);
                    }else{
                        System.out.println("y="+m+" x"+b);
                    }

                }

            }
        }
    
    }
}
