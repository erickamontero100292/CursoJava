package clases.polimorfismo;

/**
 * Created by Ericka on 10-07-2016.
 */
public class Figura {

    private Double base;
    private Double altura;


    public void calcularArea() {

        System.out.println("Se calcula el area de la figura");
    }



    public void mostrarNombre() {

        System.out.println("SOY UNA FIGURA GEOMETRICA");
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}



