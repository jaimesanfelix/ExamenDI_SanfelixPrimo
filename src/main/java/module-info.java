module com.recuperacion.recuperacionordinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.recuperacion.recuperacionordinaria to javafx.fxml;
    exports com.recuperacion.recuperacionordinaria;
    exports com.recuperacion.recuperacionordinaria.modulos;
    exports com.recuperacion.recuperacionordinaria.excepciones;
    exports com.recuperacion.recuperacionordinaria.datos;

}