package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FormEstacionNormalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BTCrearEstacion;

    @FXML
    private Button btCrearPDC;

    @FXML
    private SplitMenuButton cbPDC;

    @FXML
    private TextField txCostoPorHora;

    @FXML
    private TextField txEstacionCapacidad;

    @FXML
    private TextField txEstacionDireccion;

    @FXML
    private TextField txEstacionEstado;

    @FXML
    private TextField txEstacionId;

    @FXML
    private TextField txMaxSoportado;

    @FXML
    private TextField txNombreEstacion;

    @FXML
    private TextField txtiempoCarga;

    @FXML
    private AnchorPane viewEstacionNormal;

    @FXML
    void crearEstacion(ActionEvent event) {

    }

    @FXML
    void crearPdC(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BTCrearEstacion != null : "fx:id=\"BTCrearEstacion\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert btCrearPDC != null : "fx:id=\"btCrearPDC\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert cbPDC != null : "fx:id=\"cbPDC\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txCostoPorHora != null : "fx:id=\"txCostoPorHora\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txEstacionCapacidad != null : "fx:id=\"txEstacionCapacidad\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txEstacionDireccion != null : "fx:id=\"txEstacionDireccion\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txEstacionEstado != null : "fx:id=\"txEstacionEstado\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txEstacionId != null : "fx:id=\"txEstacionId\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txMaxSoportado != null : "fx:id=\"txMaxSoportado\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txNombreEstacion != null : "fx:id=\"txNombreEstacion\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";
        assert txtiempoCarga != null : "fx:id=\"txtiempoCarga\" was not injected: check your FXML file 'FormEstacionNormal.fxml'.";

    }

}
