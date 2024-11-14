package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.poli.modelo.*;
import co.edu.poli.utilities.Paths;
import co.edu.poli.vista.Estacion_E_Ultra;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FormPuntoDeCargaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btCrearPDC;

    @FXML
    private RadioButton opNo;

    @FXML
    private RadioButton opYes;

    private ToggleGroup opcionesGroup = new ToggleGroup();

    @FXML
    private TextField tcConectorPDC;

    @FXML
    private TextField txEstadoEquipoPDC;

    @FXML
    private TextField txIDPuntoDeCarga;

    @FXML
    private ComboBox<Equipo> cbEquipos;

    @FXML
    private AnchorPane viewPdC;

    Mantenimiento[] listaMantenimiento = new Mantenimiento[9];
    Equipo equipoUnoNormal = new Equipo("HYYUI099", 90.0, "Normal", listaMantenimiento);
    Equipo equipoUnoRapido = new Equipo("HYYUI099", 90.0, "Rapido", listaMantenimiento);
    Equipo equipoUnoUltra = new Equipo("HYYUI099", 90.0, "Ultra", listaMantenimiento);

    @FXML
    void crearPdC(ActionEvent event) {
        String idPDC = txIDPuntoDeCarga.getText();
        String estadoPDC = txEstadoEquipoPDC.getText();
        String conectorPDC = tcConectorPDC.getText();
        boolean valorBooleano = false;

        Equipo equipoSeleccionado = cbEquipos.getSelectionModel().getSelectedItem();

        RadioButton seleccionado = (RadioButton) opcionesGroup.getSelectedToggle();

        if (seleccionado != null) {
            // Obtenemos el texto seleccionado
            String textoSeleccionado = seleccionado.getText();

            // Convertimos "Sí" a true y "No" a false
            valorBooleano = textoSeleccionado.equals("Sí");
        } else {
            System.out.println("No hay ninguna opción seleccionada");
        }

        if (equipoSeleccionado.getTipo().equalsIgnoreCase("Normal")){
            PuntoDeCarga pdcUno = new PuntoDeCarga(idPDC, valorBooleano, conectorPDC, estadoPDC, equipoUnoNormal);
            System.out.println("Punto de Carga = " + pdcUno);
        } else if (equipoSeleccionado.getTipo().equalsIgnoreCase("Rapido")){
            PuntoDeCarga pdcUno = new PuntoDeCarga(idPDC, valorBooleano, conectorPDC, estadoPDC, equipoUnoRapido);
            System.out.println("Punto de Carga = " + pdcUno);
        } else {
            PuntoDeCarga pdcUno = new PuntoDeCarga(idPDC, valorBooleano, conectorPDC, estadoPDC, equipoUnoUltra);
            System.out.println("Punto de Carga = " + pdcUno);
        }




        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_EQUIPO_NORMAL));
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
    void crearEquipo(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_EQUIPO_NORMAL));
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
        assert btCrearPDC != null : "fx:id=\"btCrearPDC\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert opNo != null : "fx:id=\"opNo\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert opYes != null : "fx:id=\"opYes\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert tcConectorPDC != null : "fx:id=\"tcConectorPDC\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert txEstadoEquipoPDC != null : "fx:id=\"txEstadoEquipoPDC\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";
        assert txIDPuntoDeCarga != null : "fx:id=\"txIDPuntoDeCarga\" was not injected: check your FXML file 'FormPuntoDeCarga.fxml'.";

        opNo.setToggleGroup(opcionesGroup);
        opYes.setToggleGroup(opcionesGroup);

        cbEquipos.getItems().addAll(equipoUnoNormal, equipoUnoRapido, equipoUnoUltra);

    }

}
