package com.pattern.original;

/**
 * Created by Ericka on 04-07-2016.
 */
public class Memento {

    private int level;

    /**
     * Establece el nuevo nivel a guardar.
     * @param levelToSave
     */
    public  Memento (int levelToSave){

        level = levelToSave;
    }

    /**
     * Obtiene el nivel salvado.
     * @return
     */
    public int obtenerLevel(){
        return level;
    }
}
