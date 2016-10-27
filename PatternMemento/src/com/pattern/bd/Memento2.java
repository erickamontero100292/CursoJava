package com.pattern.bd;

import java.util.ArrayList;

/**
 * Created by Ericka on 04-07-2016.
 */
public class Memento2 {

    private ArrayList<Registro> listaRegistro;

    public ArrayList<Registro> obtenerListaRegistro() {
        return listaRegistro;
    }

    public Memento2 (ArrayList<Registro> listaRegistro) {
        //se tiene que crear una nueva lista, ya que que si se deja la que se le pasa por parametro
        //estaran compartiendo la misma direccion de memoria y siempre seran las mismas listas
        //al generar nuevas listas se rompe el lazo que existe
        //la primera vez se crea una lista de 2
        // la segunda vez se crea una de lista 4
        // la terceta vez se crea una lista 6
        //totalmente independiente de la lista que se le pasa por la firma.
        ArrayList<Registro> lista = new ArrayList<Registro>();
        for (Registro registro : listaRegistro) {
            lista.add(registro);
        }
        this.listaRegistro = lista;

    }
}
