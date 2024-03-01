package com.recuperacion.recuperacionordinaria;

import com.recuperacion.recuperacionordinaria.datos.Alumnos;
import com.recuperacion.recuperacionordinaria.datos.Empresas;
import com.recuperacion.recuperacionordinaria.modulos.Alumno;
import com.recuperacion.recuperacionordinaria.modulos.Empresa;
import com.recuperacion.recuperacionordinaria.modulos.PuestoPracticas;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    @FXML
    private Button bt_asignarPracticas;

    @FXML
    private Button bt_deAsignarPracticas;
    @FXML
    private Button bt_cargarDatos;

    @FXML
    private DatePicker dp_finPracticas;

    @FXML
    private DatePicker dp_inicioPracticas;

    @FXML
    private ListView<Empresa> tv_Empresa;
    private List<Empresa> empresas = new ArrayList<>();

    @FXML
    private ListView<Alumno> tv_alumnos;
    private List<Alumno> alumnos = new ArrayList<>();

    @FXML
    private ListView<PuestoPracticas> tv_practicas;
    private List<PuestoPracticas> puestoPracticas = new ArrayList<>();

    @FXML
    private TextField tv_responsable;


    public void rellenarDatos(){
        empresas.add(new Empresa(Empresas.E1.getId(), Empresas.E1.getResponsable(), Empresas.E1.getDireccion()));
        empresas.add(new Empresa(Empresas.E2.getId(), Empresas.E2.getResponsable(), Empresas.E2.getDireccion()));
        tv_Empresa.getItems().addAll(empresas);

        alumnos.add(new Alumno(Alumnos.A1.getDni(), Alumnos.A1.getNombre(), Alumnos.A1.getTelefono(), Alumnos.A1.isAsignado()));
        alumnos.add(new Alumno(Alumnos.A2.getDni(), Alumnos.A2.getNombre(), Alumnos.A2.getTelefono(), Alumnos.A2.isAsignado()));
        tv_alumnos.getItems().addAll(alumnos);
    }


    public void asignarPracticas(){
        int idPractica = 1;
        Empresa empresa = new Empresa(tv_Empresa.selectionModelProperty().get().getSelectedItem().getId(), tv_responsable.getText(), null);
        Alumno alumno = new Alumno(tv_alumnos.selectionModelProperty().get().getSelectedItem().getNombre());

        tv_practicas.getItems().add(new PuestoPracticas(idPractica, alumno, empresa, dp_inicioPracticas.getValue(), dp_finPracticas.getValue()));

    }


}