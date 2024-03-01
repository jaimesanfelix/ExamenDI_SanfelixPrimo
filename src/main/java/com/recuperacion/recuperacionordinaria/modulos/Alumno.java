package com.recuperacion.recuperacionordinaria.modulos;

import com.recuperacion.recuperacionordinaria.excepciones.AlumnoExistenteException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {

    private String dni;
    private String nombre;
    private String telefono;
    private boolean asignado;

    private List<Alumno> alumnos = new ArrayList<>();

    /**
     * Constructor principal de la clase Alumno
     * @param dni dni del Alumno
     */
    public Alumno(String dni) {
        this.dni = dni;
    }

    /**
     * Constructor completo de la clase Alumno
     * @param dni dni del Alumno
     * @param nombre nombre del Alumno
     * @param telefono telefono del Alumno
     * @param asignado Asignacion del Alumno
     */
    public Alumno(String dni, String nombre, String telefono, boolean asignado) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.asignado = asignado;
    }

    /**
     * Getter de DNI
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter de DNI
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Getter de nombre de alumno
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre de alumno
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de telefono
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter de telefono
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Getter de si un alumno esta asignado a una practica
     * @return asignado
     */
    public boolean isAsignado() {
        return asignado;
    }

    /**
     * Setter de si un alumno esta asignado a una practica
     * @param asignado
     */
    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }


    /**
     * Da de alta un nuevo alumno y lo añade al conjunto de alumnos para asignarlos a las practicas
     * @param alumno referencia al alumno que vamos a dar de alta
     */
    public void altaAlumno(Alumno alumno){
        if (alumnos.contains(alumno)) throw new AlumnoExistenteException(alumno);
        alumnos.add(alumno);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", asignado=" + asignado +
                '}';
    }
}
