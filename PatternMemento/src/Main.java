import com.pattern.original.Caretaker;
import com.pattern.original.Originator;
import com.pattern.bd.Caretaker2;
import com.pattern.bd.Originator2;
import com.pattern.bd.Registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Caretaker care = new Caretaker();
        Originator ori = new Originator();
        int nivelRestaurado = -1;

        //guardarmos el primer nivel
        ori.setLevel(0);
        //Y generamos la instantanea
        //Este es el primer memento que guardaremos
        //Lo manda a crear la clase Caretaker, ya que este es quien sabe cuando es necesario crear una instantanea
        care.crearMemento(ori.crearMemento());
        //Quien se encarga de generar
        ori.setLevel(1);
        ori.setLevel(2);
        ori.setLevel(3);
        //creamos otro punto para guardar, se le puede decir checkpoint.
        care.crearMemento(ori.crearMemento());

        //En este instantante solo tenemos dos mementos guardados.

        ori.setLevel(4);
        ori.setLevel(5);
        care.crearMemento(ori.crearMemento());
        ori.setLevel(6);
        care.crearMemento(ori.crearMemento());

        //Ahora mandamos a restaurar la instantanea que tiene el nivel 3
        //El restaurar lo hace el originator por medio del metodo establecerMemento
        ori.establecerMemento(care.getMemento(1));

        Caretaker2 caretaker2 = new Caretaker2();
        Originator2 originator2 =  new Originator2();

        ArrayList <Registro> lista = new ArrayList<Registro>();
        lista.add(new Registro("Ronald Lozada", 32, true));
        lista.add(new Registro("Alexys Lozada", 33, true));

        originator2.setListaRegistro(lista);
        caretaker2.crearMemento(originator2.crearMemento());

        lista.add(new Registro("Ericka Montero", 24, true));
        lista.add(new Registro("Barbara Montero", 15, true));
        originator2.setListaRegistro(lista);
        caretaker2.crearMemento(originator2.crearMemento());

        lista.add(new Registro("Susan Tovar", 28, true));
        lista.add(new Registro("Magaly Tovar", 26, true));
        originator2.setListaRegistro(lista);
        caretaker2.crearMemento(originator2.crearMemento());

        originator2.establecerMemento(caretaker2.getMemento(1));

        //Para escribir en consola
        Scanner sc = new Scanner(System.in);
        String nombre = "";

        nombre = sc.next();

        System.out.println("Su nombre es: "+ nombre);




    }
}
