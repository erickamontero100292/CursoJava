package com.pattern.multiClase.clases;

/**
 * Created by Ericka on 05-07-2016.
 */
public class Cuenta {

    private String nombreBanco;
    private Double monto;


    public Cuenta(String nombreBanco, Double monto) {
        this.nombreBanco = nombreBanco;
        this.monto = monto;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
