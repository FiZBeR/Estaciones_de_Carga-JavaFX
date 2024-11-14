package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.utilities.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_PRINCIPAL));
            Parent nuevaVista = loader.load();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.getScene().setRoot(nuevaVista);
        } catch (IOException e) {
            // Manejo de la excepción: puedes registrar el error o mostrar un mensaje
            e.printStackTrace();
            // También puedes mostrar un mensaje de alerta al usuario si es necesario
        }
    }

    @FXML
    void initialize() {
        assert btCrearEquipo != null : "fx:id=\"btCrearEquipo\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";
        assert txEquipoID != null : "fx:id=\"txEquipoID\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";
        assert txEquipoPotencia != null : "fx:id=\"txEquipoPotencia\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";
        assert txEquipoTipo != null : "fx:id=\"txEquipoTipo\" was not injected: check your FXML file 'FormEquipoNormal.fxml'.";

    }

}
