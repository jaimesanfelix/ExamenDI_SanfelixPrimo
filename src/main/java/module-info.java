module com.recuperacion.recuperacionordinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.recuperacion.recuperacionordinaria to javafx.fxml;
    exports com.recuperacion.recuperacionordinaria;
}