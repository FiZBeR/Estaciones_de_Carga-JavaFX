package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FormPuntoDeCargaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btCrearPDC;

    @FXML
    private RadioButton opNo;

    @FXML
    private RadioButton opYes;

    @FXML
    private TextField tcConectorPDC;

    @FXML
    private TextField txEstadoEquipoPDC;

    @FXML
    private TextField txIDPuntoDeCarga;

    @FXML
    private AnchorPane viewPdC;

    @FXML
    void crearPdC(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btCrearPDC != null : "fx:id=\"btCrearPDC\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert opNo != null : "fx:id=\"opNo\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert opYes != null : "fx:id=\"opYes\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert tcConectorPDC != null : "fx:id=\"tcConectorPDC\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert txEstadoEquipoPDC != null : "fx:id=\"txEstadoEquipoPDC\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert txIDPuntoDeCarga != null : "fx:id=\"txIDPuntoDeCarga\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";

    }

}
