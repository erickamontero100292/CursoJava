package com.pattern.original;

import java.util.ArrayList;

/**
 * Created by Ericka on 04-07-2016.
 */
public class Caretaker {

    private ArrayList<Memento> savedLevels = new ArrayList<Memento>();

    /**
     * Metodo que permite salva guardar el memento
     * @param m
     */
   public void  crearMemento(Memento m){
       savedLevels.add(m);
   }

    /**
     * Metodo que retorna el memento que se quiere restaurar.
     * @param index
     * @return
     */
    public Memento getMemento(int index){

        return savedLevels.get(index);
    }
}
