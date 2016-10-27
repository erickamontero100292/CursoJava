package com.pattern.bd;

import java.util.ArrayList;

/**
 * Created by Ericka on 04-07-2016.
 */
public class Originator2 {

    private ArrayList<Registro> listaRegistro;

    /**
     * Metodo que permite setear la lista de registro que se guardara posteriormente.
     * @param lista
     */
    public void setListaRegistro(ArrayList<Registro> lista){this.listaRegistro = lista;}

    public Memento2 crearMemento(){

        return new Memento2(listaRegistro);
    }

    public void establecerMemento(Memento2 m){

        listaRegistro = m.obtenerListaRegistro();
        mostrarRegistro();
    }

    public void mostrarRegistro(){

        for(Registro res : listaRegistro) {

            res.getRegistro();
        }
    }
}
