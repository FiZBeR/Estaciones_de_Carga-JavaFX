
package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FormEquipoUltraController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btCrearEquipoUltra;

    @FXML
    private RadioButton opNo;

    @FXML
    private RadioButton opYes;

    @FXML
    private TextField txEquipoUID;

    @FXML
    private TextField txEquipoUMaxCapacity;

    @FXML
    private TextField txEquipoUPotencia;

    @FXML
    private TextField txEquipoUSistemaEnfriamiento;

    @FXML
    private TextField txEquipoUTimeCarga;

    @FXML
    private TextField txEquipoUTipoConector;

    @FXML
    private TextField txEquipoUVoltaje;

    @FXML
    void crearEquiUltra(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btCrearEquipoUltra != null : "fx:id=\"btCrearEquipoUltra\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert opNo != null : "fx:id=\"opNo\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert opYes != null : "fx:id=\"opYes\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert txEquipoUID != null : "fx:id=\"txEquipoUID\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert txEquipoUMaxCapacity != null : "fx:id=\"txEquipoUMaxCapacity\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert txEquipoUPotencia != null : "fx:id=\"txEquipoUPotencia\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert txEquipoUSistemaEnfriamiento != null : "fx:id=\"txEquipoUSistemaEnfriamiento\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert txEquipoUTimeCarga != null : "fx:id=\"txEquipoUTimeCarga\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert txEquipoUTipoConector != null : "fx:id=\"txEquipoUTipoConector\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";
        assert txEquipoUVoltaje != null : "fx:id=\"txEquipoUVoltaje\" was not injected: check your FXML file 'FormEquipoUltra.fxml'.";

    }

}

