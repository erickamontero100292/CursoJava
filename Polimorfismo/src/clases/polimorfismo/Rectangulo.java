package clases.polimorfismo;

/**
 * Created by Ericka on 10-07-2016.
 */
public class Rectangulo extends Figura {

    @Override
    public void mostrarNombre(){

        System.out.println("SOY UN RECTANGULO");

    }

    public void calcularArea(Double base, Double altura) {
        Double area = 0.0;
        area =(base * altura);
        System.out.println("Se calcula el area del rectangulo: " + area );
    }

}
