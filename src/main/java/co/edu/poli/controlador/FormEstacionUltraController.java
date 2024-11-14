package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.modelo.*;
import co.edu.poli.utilities.Paths;
import co.edu.poli.vista.Estacion_E_Rapida;
import co.edu.poli.vista.Estacion_E_Ultra;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private ComboBox<PuntoDeCarga> cbPDC;

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

    Mantenimiento[] listaMantenimiento = new Mantenimiento[9];
    EquipoUltra equipoUnoUltra = new EquipoUltra("QWTYYY24", 240.0, "Ultra",240.0, "Sistema de Enfriamiento uno", 15.000, "si", listaMantenimiento);
    EquipoUltra equipoDosUltra = new EquipoUltra("LKJHF765", 300.0, "Ultra", 300.0, "Sistema de Enfriamiento dos", 20.000, "si", listaMantenimiento);
    EquipoUltra equipoTresUltra = new EquipoUltra("ZXCVB432", 280.0, "Ultra", 280.0, "Sistema de Enfriamiento tres", 18.500, "no", listaMantenimiento);

    PuntoDeCarga pdCUltra = new PuntoDeCarga("VHHDY209", false, "Ultra", "Bueno", equipoUnoUltra);
    PuntoDeCarga pdCUltraDos = new PuntoDeCarga("MKLOP897", true, "Ultra", "Excelente", equipoDosUltra);
    PuntoDeCarga pdCUltraTres = new PuntoDeCarga("QWERT678", false, "Ultra", "Regular", equipoTresUltra);


    @FXML
    void crearEstacion(ActionEvent event) {

        String nombreEstacionU = txNombreEstacion.getText();
        String idEstacionU = txEstacionId.getText();
        String ubicacionEstacionU = txEstacionDireccion.getText();
        String estadoEstacionU = txEstacionEstado.getText();
        int capacidadEstacionU = Integer.parseInt(txEstacionCapacidad.getText());
        PuntoDeCarga[] listaPDCU = new PuntoDeCarga[9];
        PuntoDeCarga puntoSeleccionadoU = cbPDC.getSelectionModel().getSelectedItem();
        listaPDCU[0] = puntoSeleccionadoU;
        int tiempoEstacionU = Integer.parseInt(txtiempoCargaUltra.getText());
        String compativilidadU = txCompatibilidad.getText();
        double tarifaCargaU = Double.parseDouble(txCostoPorHoraUltra.getText());

        Estacion_E_Ultra estacionEUltra = new Estacion_E_Ultra(nombreEstacionU, idEstacionU, ubicacionEstacionU, estadoEstacionU, capacidadEstacionU,
                listaPDCU, tiempoEstacionU, compativilidadU, tarifaCargaU);

        System.out.println("estacionEUltra = " + estacionEUltra);

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

        cbPDC.getItems().addAll(pdCUltra, pdCUltraDos, pdCUltraTres);
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
