package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FormEquipoRapidoController {

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
    private TextField txEquipoTimeCarga;

    @FXML
    private TextField txEquipoTipo;

    @FXML
    private TextField txEquipoTipoConector;

    @FXML
    void crearEquipoRapido(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btCrearEquipo != null : "fx:id=\"btCrearEquipo\" was not injected: check your FXML file 'FormEquipoRapido.fxml'.";
        assert txEquipoID != null : "fx:id=\"txEquipoID\" was not injected: check your FXML file 'FormEquipoRapido.fxml'.";
        assert txEquipoPotencia != null : "fx:id=\"txEquipoPotencia\" was not injected: check your FXML file 'FormEquipoRapido.fxml'.";
        assert txEquipoTimeCarga != null : "fx:id=\"txEquipoTimeCarga\" was not injected: check your FXML file 'FormEquipoRapido.fxml'.";
        assert txEquipoTipo != null : "fx:id=\"txEquipoTipo\" was not injected: check your FXML file 'FormEquipoRapido.fxml'.";
        assert txEquipoTipoConector != null : "fx:id=\"txEquipoTipoConector\" was not injected: check your FXML file 'FormEquipoRapido.fxml'.";

    }

}


