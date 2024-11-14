package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FormEstacionRapidaController {

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
    private TextField txCargaPromedio;

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
    private TextField txTariafaCarga;

    @FXML
    private AnchorPane viewEstacionRapida;

    @FXML
    void crearEstacion(ActionEvent event) {

    }

    @FXML
    void crearPdC(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BTCrearEstacion != null : "fx:id=\"BTCrearEstacion\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert btCrearPDC != null : "fx:id=\"btCrearPDC\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert cbPDC != null : "fx:id=\"cbPDC\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert txCargaPromedio != null : "fx:id=\"txCargaPromedio\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert txEstacionCapacidad != null : "fx:id=\"txEstacionCapacidad\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert txEstacionDireccion != null : "fx:id=\"txEstacionDireccion\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert txEstacionEstado != null : "fx:id=\"txEstacionEstado\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert txEstacionId != null : "fx:id=\"txEstacionId\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert txNombreEstacion != null : "fx:id=\"txNombreEstacion\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert txTariafaCarga != null : "fx:id=\"txTariafaCarga\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";

    }

}
