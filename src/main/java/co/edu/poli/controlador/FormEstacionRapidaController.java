package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.modelo.*;
import co.edu.poli.utilities.Paths;
import co.edu.poli.vista.Estacion_E_Normal;
import co.edu.poli.vista.Estacion_E_Rapida;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private ComboBox<PuntoDeCarga> cbPDC;

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

    Mantenimiento[] listaMantenimiento = new Mantenimiento[9];
    EquipoRapido equipoUnoRapido = new EquipoRapido("WERRT67", 120.0, "Rapido", 90, "CSS", listaMantenimiento);
    EquipoRapido equipoDosRapido = new EquipoRapido("ASDFG123", 130.0, "Rapido", 85, "Sistema de Enfriamiento dos", listaMantenimiento);
    EquipoRapido equipoTresRapido = new EquipoRapido("GHJKL456", 115.0, "Rapido", 95, "Sistema de Enfriamiento tres", listaMantenimiento);

    PuntoDeCarga pdCRapido = new PuntoDeCarga("UTYTIO9887", true, "Rapido", "Medio", equipoUnoRapido);
    PuntoDeCarga pdCRapidoDos = new PuntoDeCarga("BNMV987", false, "Rapido", "Alto", equipoDosRapido);
    PuntoDeCarga pdCRapidoTres = new PuntoDeCarga("LKJHG321", true, "Rapido", "Bajo", equipoTresRapido);
    @FXML
    void crearEstacion(ActionEvent event) {
        String nombreEstacionR = txNombreEstacion.getText();
        String idEstacionR = txEstacionId.getText();
        String ubicacionEstacionR = txEstacionDireccion.getText();
        String estadoEstacionR = txEstacionEstado.getText();
        int capacidadEstacionR = Integer.parseInt(txEstacionCapacidad.getText());
        PuntoDeCarga[] listaPDCR = new PuntoDeCarga[9];
        PuntoDeCarga puntoSeleccionadoR = cbPDC.getSelectionModel().getSelectedItem();
        listaPDCR[0] = puntoSeleccionadoR;
        int tiempoEstacionR = Integer.parseInt(txCargaPromedio.getText());
        double tarifaCargaR = Double.parseDouble(txTariafaCarga.getText());

        Estacion_E_Rapida estacionERapida = new Estacion_E_Rapida(nombreEstacionR, idEstacionR, ubicacionEstacionR, estadoEstacionR, capacidadEstacionR, listaPDCR, tiempoEstacionR, tarifaCargaR);

        System.out.println("estacionERapida = " + estacionERapida);

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

        cbPDC.getItems().addAll(pdCRapido, pdCRapidoDos, pdCRapidoTres);
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
