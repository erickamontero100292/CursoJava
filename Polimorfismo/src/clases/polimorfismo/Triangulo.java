package clases.polimorfismo;

/**
 * Created by Ericka on 10-07-2016.
 */
public class Triangulo extends Figura {



    @Override
    public void mostrarNombre(){

        System.out.println("SOY UN TRIANGULO");

    }

    public void calcularArea(Double base, Double altura) {
        Double area = 0.0;
        area =( (base * altura) / 2.0);
        System.out.println("Se calcula el area del triangulo: " + area );
    }


}


