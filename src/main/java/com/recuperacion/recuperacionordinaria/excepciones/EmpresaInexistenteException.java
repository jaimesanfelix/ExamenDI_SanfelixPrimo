package com.recuperacion.recuperacionordinaria.excepciones;

public class EmpresaInexistenteException extends NullPointerException{
    public EmpresaInexistenteException() {
        super("El campo de empresa esta vacio");
    }
}
