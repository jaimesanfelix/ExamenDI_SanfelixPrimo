package com.recuperacion.recuperacionordinaria.modulos;

import com.recuperacion.recuperacionordinaria.excepciones.EmpresaExistenteException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    private int id;
    private String responsable;
    private String direccion;

    private List<Empresa> empresas = new ArrayList<>();

    /**
     * Constructor de la clase Empresa
     * @param id id de la Empresa
     * @param responsable responsable de la Empresa
     * @param direccion direccion de la Empresa
     */
    public Empresa(int id, String responsable, String direccion) {
        this.id = id;
        this.responsable = responsable;
        this.direccion = direccion;
    }


    /**
     * Getter del id de empresa
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter del id de empresa
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter del responsable de la empresa
     * @return responsable
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     * Setter del responsable de la empresa
     * @param responsable
     */
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    /**
     * Getter de la direccion de la empresa
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter de la direcion de la empresa
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /**
     * Da de alta un nueva empresa que se añadira al conjunto de empresas para ser asignados a practicas
     * @param empresa referencia al objeto de Empresa para darse de alta
     */
    public void altaEmpresa(Empresa empresa){
        if (empresas.stream().noneMatch(e -> e.getId() == empresa.id)){
            empresas.add(empresa);
        }else {
            throw new EmpresaExistenteException(empresa);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return id == empresa.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", responsable='" + responsable + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
