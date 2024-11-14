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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NuevaVistaPrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btCrear;

    @FXML
    private Button btEliminar;

    @FXML
    private Button btdetalles;

    @FXML
    private TableColumn<?, ?> columnCapacidad;

    @FXML
    private TableColumn<?, ?> columnEstado;

    @FXML
    private TableColumn<?, ?> columnEstadoPdC;

    @FXML
    private TableColumn<?, ?> columnID;

    @FXML
    private TableColumn<?, ?> columnNombre;

    @FXML
    private TableColumn<?, ?> columnUbi;

    @FXML
    private TableView<?> infoTable;

    @FXML
    private TextField laID;

    @FXML
    private AnchorPane subViewMain;

    @FXML
    private AnchorPane viewMain;

    @FXML
    void crear(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_CREAR));
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
    void delete(ActionEvent event) {

    }

    @FXML
    void infoID(ActionEvent event) {

    }

    @FXML
    void search(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btCrear != null : "fx:id=\"btCrear\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert btEliminar != null : "fx:id=\"btEliminar\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert btdetalles != null : "fx:id=\"btdetalles\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert columnCapacidad != null : "fx:id=\"columnCapacidad\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert columnEstado != null : "fx:id=\"columnEstado\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert columnEstadoPdC != null : "fx:id=\"columnEstadoPdC\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert columnID != null : "fx:id=\"columnID\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert columnNombre != null : "fx:id=\"columnNombre\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert columnUbi != null : "fx:id=\"columnUbi\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert infoTable != null : "fx:id=\"infoTable\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert laID != null : "fx:id=\"laID\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert subViewMain != null : "fx:id=\"subViewMain\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";
        assert viewMain != null : "fx:id=\"viewMain\" was not injected: check your FXML file 'NuevaVistaPincipal.fxml'.";

    }
}
