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
public class ContarCifra {
    
    public void contarCifra(){
        int numero = 56;
        int aux= numero;
        int contadorNumero = 0;
        int sumarCifra = 0;
        while(aux!=0){
            
            sumarCifra = sumarCifra +numero % 10;
            numero = numero/10;
            contadorNumero++;
            aux =numero;
            System.out.println("Div: "+numero/10);
            System.out.println("Mod:" +numero%10);
        }
        System.out.println("Div: "+56/10);
        System.out.println("Mod:" +56%10);
        System.out.println("Cantidad de cifras: "+contadorNumero);
        System.out.println("Suma cifras:" + sumarCifra);
    
    }
}
