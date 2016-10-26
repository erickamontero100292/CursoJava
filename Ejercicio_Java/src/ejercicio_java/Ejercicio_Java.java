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
public class Ejercicio_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Multiplicar muliplo = new Multiplicar(0);
        SerieNumerica serie = new SerieNumerica(8);
//      Factorial facto = new Factorial(4);
//        Matrices_Estructura matriz = new Matrices_Estructura();
//        ContarCifra contar = new ContarCifra();
       // ConstanteConway conway = new ConstanteConway();
        serie.crearSerie();
        serie.mostrarSerie();
//        System.out.println("El factorial es: "+facto.factorial(4));
//        matriz.mejorProducto();
//        contar.contarCifra();
       // conway.serie();
        //mul.tablas2();
        EcuacionDeLaRecta recta = new EcuacionDeLaRecta();
        recta.ecuacion(3, 2, 2, 2);
    }
    
}
