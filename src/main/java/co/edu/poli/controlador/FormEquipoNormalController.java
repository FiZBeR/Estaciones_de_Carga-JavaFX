package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FormEquipoNormalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btCrearEquipo;

    @FXML
    private TextField txEquipoID;

    @FXML
    private TextField txEquipoPotencia;

    @FXML
    private TextField txEquipoTipo;

    @FXML
    void crearEquipo(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btCrearEquipo != null : "fx:id=\"btCrearEquipo\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";
        assert txEquipoID != null : "fx:id=\"txEquipoID\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";
        assert txEquipoPotencia != null : "fx:id=\"txEquipoPotencia\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";
        assert txEquipoTipo != null : "fx:id=\"txEquipoTipo\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";

    }

}
