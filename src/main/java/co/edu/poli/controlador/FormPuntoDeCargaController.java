package co.edu.poli.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FormPuntoDeCargaController {

    @FXML
    private Button btCrearEquipo;

    @FXML
    private Button btCrearPDC;

    @FXML
    private ComboBox<?> cbSelectEquipo;

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

}
