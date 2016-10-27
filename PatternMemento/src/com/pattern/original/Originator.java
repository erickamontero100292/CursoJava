package com.pattern.original;

/**
 * Created by Ericka on 04-07-2016.
 */
public class Originator {

    /**
     * Atributo que guardara el nivel del juego.
     */
    private int  level;

    public int getLevel() {
        return level;
    }

    /**
     * Metodo que permite cambiar el valor del nivel.
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Metodo encargador de retorna una instancia del memento.
     * Es la instantanea que queremos almacenar.
     * @return
     */
    public Memento crearMemento (){

        return new Memento(level);
    }

    /**
     * Metodo que restaura la instantanea anterior.
     * @param m
     */
    public void establecerMemento(Memento m){

        level = m.obtenerLevel();
        System.out.println("Nivel restaurado: " + level);
    }
}
