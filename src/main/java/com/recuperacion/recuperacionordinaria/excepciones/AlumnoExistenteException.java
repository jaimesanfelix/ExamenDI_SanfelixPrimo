package com.recuperacion.recuperacionordinaria.excepciones;

import com.recuperacion.recuperacionordinaria.modulos.Alumno;

public class AlumnoExistenteException extends IllegalArgumentException{

    public AlumnoExistenteException(Alumno alumno) {
        super("El alumno con el dni " + alumno.getDni() + " ya existe");
    }
}
