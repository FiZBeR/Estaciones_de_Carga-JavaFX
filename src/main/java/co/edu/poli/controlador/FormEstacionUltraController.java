package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FormEstacionUltraController {

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
    private TextField txCompatibilidad;

    @FXML
    private TextField txCostoPorHoraUltra;

    @FXML
    private TextField txEstacionCapacidad;

    @FXML
    private TextField txEstacionDireccion;

    @FXML
    private TextField txEstacionEstado;

    @FXML
    private TextField txEstacionId;

    @FXML
    private TextField txNombreEstacion;

    @FXML
    private TextField txtiempoCargaUltra;

    @FXML
    private AnchorPane viewEstacionUltra;

    @FXML
    void crearEstacion(ActionEvent event) {

    }

    @FXML
    void crearPdC(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BTCrearEstacion != null : "fx:id=\"BTCrearEstacion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert btCrearPDC != null : "fx:id=\"btCrearPDC\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert cbPDC != null : "fx:id=\"cbPDC\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txCompatibilidad != null : "fx:id=\"txCompatibilidad\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txCostoPorHoraUltra != null : "fx:id=\"txCostoPorHoraUltra\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txEstacionCapacidad != null : "fx:id=\"txEstacionCapacidad\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txEstacionDireccion != null : "fx:id=\"txEstacionDireccion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txEstacionEstado != null : "fx:id=\"txEstacionEstado\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txEstacionId != null : "fx:id=\"txEstacionId\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txNombreEstacion != null : "fx:id=\"txNombreEstacion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert txtiempoCargaUltra != null : "fx:id=\"txtiempoCargaUltra\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";

    }

}
