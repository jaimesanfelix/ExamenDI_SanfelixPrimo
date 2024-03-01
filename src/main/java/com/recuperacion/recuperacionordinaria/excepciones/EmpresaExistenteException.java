package com.recuperacion.recuperacionordinaria.excepciones;

import com.recuperacion.recuperacionordinaria.modulos.Empresa;

public class EmpresaExistenteException extends IllegalArgumentException{
    public EmpresaExistenteException(Empresa empresa) {
        super("La empresa con el id " + empresa.getId() + " ya existe");
    }
}
