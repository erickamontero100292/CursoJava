package com.pattern.multiClase.clases;

/**
 * Created by Ericka on 05-07-2016.
 */
public class Persona {

    private String nombre;
    private String cedula;
    private Cuenta cuenta;


    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }


    public Persona(String nombre, String cedula, Cuenta cuenta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}

