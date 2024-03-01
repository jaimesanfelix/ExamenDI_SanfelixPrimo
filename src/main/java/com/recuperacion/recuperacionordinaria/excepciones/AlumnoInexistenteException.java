package com.recuperacion.recuperacionordinaria.excepciones;

public class AlumnoInexistenteException extends NullPointerException{
    public AlumnoInexistenteException() {
        super("El campo de alumno esta vacio");
    }
}
