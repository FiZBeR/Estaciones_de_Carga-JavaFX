package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.modelo.*;
import co.edu.poli.utilities.Paths;
import co.edu.poli.vista.Estacion_E_Normal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private ComboBox<PuntoDeCarga> cbPDC;

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

    Mantenimiento[] listaMantenimiento = new Mantenimiento[9];
    Equipo equipoUnoNormal = new Equipo("HYYUI099", 90.0, "Normal", listaMantenimiento);
    Equipo equipoDosNormal = new Equipo("PLKRT567", 120.0, "Normal", listaMantenimiento);
    Equipo equipoTresNormal = new Equipo("JHGDY789", 150.0, "Normal", listaMantenimiento);
    PuntoDeCarga pdCNormal = new PuntoDeCarga("CVVBH234", true, "Normal", "Bueno", equipoUnoNormal);
    PuntoDeCarga pdCNormalDos = new PuntoDeCarga("FGRTE345", true, "Normal", "Excelente", equipoDosNormal);
    PuntoDeCarga pdCNormalTres = new PuntoDeCarga("MNJKO678", false, "Normal", "Regular", equipoTresNormal);


    @FXML
    void crearEstacion(ActionEvent event) {

        String nombreEstacion = txNombreEstacion.getText();
        String idEstacion = txEstacionId.getText();
        String ubicacionEstacion = txEstacionDireccion.getText();
        String estadoEstacion = txEstacionEstado.getText();
        int capacidadEstacion = Integer.parseInt(txEstacionCapacidad.getText());
        PuntoDeCarga[] listaPDC = new PuntoDeCarga[9];
        PuntoDeCarga puntoSeleccionado = cbPDC.getSelectionModel().getSelectedItem();
        listaPDC[0] = puntoSeleccionado;
        int tiempoEstacion = Integer.parseInt(txtiempoCarga.getText());
        double costoHoraEstacion = Double.parseDouble(txCostoPorHora.getText());
        double nivelCargaMAxEstacion = Double.parseDouble(txMaxSoportado.getText());

        Estacion_E_Normal estacionENormal = new Estacion_E_Normal(nombreEstacion, idEstacion, ubicacionEstacion, estadoEstacion, capacidadEstacion, listaPDC,
                tiempoEstacion, costoHoraEstacion, nivelCargaMAxEstacion);

        System.out.println("estacionENormal = " + estacionENormal);

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
    void crearPdC(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_PUNTODECARGA));
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

        cbPDC.getItems().addAll(pdCNormal, pdCNormalDos, pdCNormalTres);
        cbPDC.setCellFactory(param -> new ListCell<PuntoDeCarga>() {
            @Override
            protected void updateItem(PuntoDeCarga item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setText(null);
                } else {
                    // Aquí puedes mostrar el atributo que desees, por ejemplo, el id
                    setText(item.getIdPdC() + " " + item.getConector());  // Supongamos que PuntoDeCarga tiene un método getId()
                }
            }
        });
    }

}
