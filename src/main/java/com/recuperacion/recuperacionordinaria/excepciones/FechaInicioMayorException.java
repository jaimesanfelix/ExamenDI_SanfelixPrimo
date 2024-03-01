package com.recuperacion.recuperacionordinaria.excepciones;

import java.time.LocalDate;

public class FechaInicioMayorException extends IllegalArgumentException{
    public FechaInicioMayorException(LocalDate fechaInicio, LocalDate fechaFinal) {
        super("La fecha de inicio " + fechaInicio + " esta despues de la fecha de finalizacion " + fechaFinal);
    }
}
