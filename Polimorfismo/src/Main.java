import clases.polimorfismo.Figura;
import clases.polimorfismo.Rectangulo;
import clases.polimorfismo.Triangulo;

public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Figura figura = new Figura();

        figura.mostrarNombre();
        rectangulo.mostrarNombre();
        triangulo.mostrarNombre();

        figura.calcularArea();
        rectangulo.calcularArea();
        triangulo.calcularArea();


        rectangulo.calcularArea(2.5 ,2.5);
        triangulo.calcularArea(2.0,2.0);


    }
}
