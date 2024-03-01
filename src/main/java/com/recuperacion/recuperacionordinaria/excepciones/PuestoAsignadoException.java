package com.recuperacion.recuperacionordinaria.excepciones;

import com.recuperacion.recuperacionordinaria.modulos.PuestoPracticas;

public class PuestoAsignadoException extends IllegalArgumentException{

    public PuestoAsignadoException(PuestoPracticas puesto){
        super("El puesto " + puesto + " ya esta asignado");
    }

}
