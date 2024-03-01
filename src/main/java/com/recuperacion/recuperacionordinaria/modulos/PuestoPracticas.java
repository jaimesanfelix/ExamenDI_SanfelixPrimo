package com.recuperacion.recuperacionordinaria.modulos;


import com.recuperacion.recuperacionordinaria.excepciones.AlumnoInexistenteException;
import com.recuperacion.recuperacionordinaria.excepciones.EmpresaInexistenteException;
import com.recuperacion.recuperacionordinaria.excepciones.FechaInicioMayorException;
import com.recuperacion.recuperacionordinaria.excepciones.PuestoAsignadoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PuestoPracticas {

    private int id;
    private Alumno alumno;
    private Empresa empresa;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private List<PuestoPracticas> puestos = new ArrayList<>();

    /**
     * Constructor de la clase PuestoPracticas
     * @param id id del Puesto
     * @param alumno Alumno asingado al Puesto
     * @param empresa Empresa asignada al Puesto
     * @param fechaInicio fecha inicio de las practicas
     * @param fechaFin fecha fin de las practicas
     */
    public PuestoPracticas(int id, Alumno alumno, Empresa empresa, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.alumno = alumno;
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     * Getter del id de las practicas
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter del id de las practicas
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter del alumno asignado a esta practica
     * @return alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * Setter del alumno a una practica
     * @param alumno
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * Getter de la empresa donde se realizaran las practicas
     * @return empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Setter de la empresa donde se realizaran las practicas
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Getter de cuando comenzaran las practicas
     * @return fechaInicio
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Setter de cuando empezaran las practicas
     * @param fechaInicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Getter de cuando acabaran las practicas
     * @return fechaFin
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Setter de cuando acabaran las practicas
     * @param fechaFin
     */
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Se asignan los alumnos y empresas a un nuevo puesto en una practica
     * @param puesto referencia al puesto donde se va añadir las practicas
     */
    public void asignarPuestoPracticas(PuestoPracticas puesto){
        if(puestos.contains(puesto)) throw new PuestoAsignadoException(puesto);
        if (!puesto.getFechaInicio().isAfter(puesto.getFechaFin())){
            puestos.add(puesto);
        }else{
            throw new FechaInicioMayorException(puesto.fechaInicio, puesto.fechaFin);
        }
        if (puesto.alumno == null){
            throw new AlumnoInexistenteException();
        } else if (puesto.empresa == null) {
            throw new EmpresaInexistenteException();
        }

    }

    /**
     * Se elimina un puesto del conjunto
     * @param puesto referencia al puesto que se va a eliminar
     */
    public void deAsignarPuestoPracticas(PuestoPracticas puesto){
        puestos.remove(puesto);
    }

    @Override
    public String toString() {
        return "PuestoPracticas{" +
                "id=" + id +
                ", alumno=" + alumno +
                ", empresa=" + empresa +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PuestoPracticas that = (PuestoPracticas) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
