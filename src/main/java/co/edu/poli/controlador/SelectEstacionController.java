package co.edu.poli.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.application.App;
import co.edu.poli.utilities.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SelectEstacionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btEstNormal;

    @FXML
    private Button btEstRapida;

    @FXML
    private Button btEstUltra;

    @FXML
    private AnchorPane viewSelect;

    private VistaPrincipalController vistaPrincipalController;

    @FXML
    void formCrear(ActionEvent event) {
        vistaPrincipalController.setSelection(2);
    }

    @FXML
    void crearRapida(ActionEvent event) {

    }

    @FXML
    void crearUltra(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btEstNormal != null : "fx:id=\"btEstNormal\" was not injected: check your FXML file 'SelectEstacion.fxml'.";
        assert btEstRapida != null : "fx:id=\"btEstRapida\" was not injected: check your FXML file 'SelectEstacion.fxml'.";
        assert btEstUltra != null : "fx:id=\"btEstUltra\" was not injected: check your FXML file 'SelectEstacion.fxml'.";
        /*assert vistaPrincipalController != null : "fx:id=\"sideOutlet\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        if (vistaPrincipalController == null){
            System.out.println("Advertencia vistaPrincipalController no se ha inicializado ");
        } else {
            System.out.println("vistaPrincipalController asignado correctamente");
        }*/

    }
}
