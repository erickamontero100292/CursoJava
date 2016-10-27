package com.pattern.bd;

import java.util.ArrayList;

/**
 * Created by Ericka on 04-07-2016.
 */
public class Caretaker2 {

    private ArrayList <Memento2> listaMemento = new ArrayList<Memento2>();

    /**
     * Metodo que permite salva guardar el memento
     * @param m
     */
    public void  crearMemento(Memento2 m){


        listaMemento.add(m);
    }

    /**
     * Metodo que retorna el memento que se quiere restaurar.
     * @param index
     * @return
     */
    public Memento2 getMemento(int index){

        return listaMemento.get(index);
    }

}
