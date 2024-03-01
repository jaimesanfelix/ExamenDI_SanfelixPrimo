package com.recuperacion.recuperacionordinaria.datos;

import com.recuperacion.recuperacionordinaria.modulos.PuestoPracticas;

import java.time.LocalDate;

public class Puestos {

    /**
     * Datos de prueba para P1(1, Alumno1, Empresa1, 20/03/2024, 20/05/2024)
     */
    public static PuestoPracticas P1 = new PuestoPracticas(1, Alumnos.A1, Empresas.E1, LocalDate.of(2024,3, 20), LocalDate.of(2024, 5, 20));

    /**
     * Datod de prueba para P2(2, Alumno2, Empresa2, 20/06/2024, 10/06/2024)
     */
    public static PuestoPracticas P2 = new PuestoPracticas(2, Alumnos.A2, Empresas.E2, LocalDate.of(2024,6, 20), LocalDate.of(2024, 6, 10));

}
