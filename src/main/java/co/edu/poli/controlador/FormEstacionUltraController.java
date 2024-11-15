package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import co.edu.poli.modelo.*;
import co.edu.poli.utilities.Paths;
import co.edu.poli.vista.Estacion_E_Rapida;
import co.edu.poli.vista.Estacion_E_Ultra;
import co.edu.poli.vista.ImplementacionOperacion;
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
    private Button btCrear;

    @FXML
    private ComboBox<PuntoDeCarga> cbPDC;

    @FXML
    private TextField lbCapacidadEstacion;

    @FXML
    private TextField lbCapacidadMAx;

    @FXML
    private TextField lbConectorPDC;

    @FXML
    private TextField lbCostoxHora;

    @FXML
    private TextField lbEstacionNombre;

    @FXML
    private TextField lbEstadoEstacion;

    @FXML
    private TextField lbEstadoPDC;

    @FXML
    private TextField lbIdEquipo;

    @FXML
    private TextField lbIdEstacion;

    @FXML
    private TextField lbIdPDC;

    @FXML
    private TextField lbNivelMax;

    @FXML
    private TextField lbPotenicaEquipo;

    @FXML
    private TextField lbSdeE;

    @FXML
    private TextField lbTiempoCarga;

    @FXML
    private TextField lbUbicacionEstacion;

    @FXML
    private TextField lbVoltajeMax;

    @FXML
    private TextField lbtipoequipo;

    @FXML
    private RadioButton rbNo;

    @FXML
    private RadioButton rbNoProteccion;

    @FXML
    private RadioButton rbYes;

    @FXML
    private RadioButton rbYesProteccion;

    private ToggleGroup opcionesGroup = new ToggleGroup();

    private ToggleGroup opcionesGroupProteccion = new ToggleGroup();

    String path = " ";
    String file = "TextNoBinary.txt";

    ImplementacionOperacion crud = new ImplementacionOperacion();

    ImplementacionOperacion op = new ImplementacionOperacion();

    Mantenimiento[] listaMantenimiento = new Mantenimiento[9];
    EquipoUltra equipoUnoUltra = new EquipoUltra("QWTYYY24", 240.0, "Ultra",240.0, "Sistema de Enfriamiento uno", 15.000, "si", listaMantenimiento);
    EquipoUltra equipoDosUltra = new EquipoUltra("LKJHF765", 300.0, "Ultra", 300.0, "Sistema de Enfriamiento dos", 20.000, "si", listaMantenimiento);
    EquipoUltra equipoTresUltra = new EquipoUltra("ZXCVB432", 280.0, "Ultra", 280.0, "Sistema de Enfriamiento tres", 18.500, "no", listaMantenimiento);

    PuntoDeCarga pdCUltra = new PuntoDeCarga("VHHDY209", false, "Ultra", "Bueno", equipoUnoUltra);
    PuntoDeCarga pdCUltraDos = new PuntoDeCarga("MKLOP897", true, "Ultra", "Excelente", equipoDosUltra);
    PuntoDeCarga pdCUltraTres = new PuntoDeCarga("QWERT678", false, "Ultra", "Regular", equipoTresUltra);



    @FXML
    void create(ActionEvent event) {

        PuntoDeCarga puntoSeleccionado = cbPDC.getSelectionModel().getSelectedItem();

        if (puntoSeleccionado != null){
            String nombreEstacion = lbEstacionNombre.getText();
            String idEstacion = lbIdEstacion.getText();
            String ubicacionEstacion = lbUbicacionEstacion.getText();
            String estadoEstacion = lbEstadoEstacion.getText();
            int capacidadEstacion = Integer.parseInt(lbCapacidadEstacion.getText());
            PuntoDeCarga[] listaPDC = new PuntoDeCarga[9];
            listaPDC[0] = puntoSeleccionado;
            int tiempoEstacion = Integer.parseInt(lbTiempoCarga.getText());
            String vehiculos = lbNivelMax.getText();
            double costoHoraEstacion = Double.parseDouble(lbCostoxHora.getText());

            Estacion_E_Ultra estacionUno = new Estacion_E_Ultra(nombreEstacion, idEstacion, ubicacionEstacion, estadoEstacion, capacidadEstacion, listaPDC, tiempoEstacion, vehiculos, costoHoraEstacion);

            System.out.println(crud.create(estacionUno));
            System.out.println("Lectura general" + Arrays.toString(crud.readAll()));

            //op.serializar(crud.readAll(), path, file);

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_PRINCIPAL));
                Parent nuevaVista = loader.load();

                Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stageActual.getScene().setRoot(nuevaVista);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String nombreEstacion = lbEstacionNombre.getText();
            String idEstacion = lbIdEstacion.getText();
            String ubicacionEstacion = lbUbicacionEstacion.getText();
            String estadoEstacion = lbEstadoEstacion.getText();
            int capacidadEstacion = Integer.parseInt(lbCapacidadEstacion.getText());
            PuntoDeCarga[] listaPDC = new PuntoDeCarga[9];
            listaPDC[0] = puntoSeleccionado;
            int tiempoEstacion = Integer.parseInt(lbTiempoCarga.getText());
            String vehiculos = lbNivelMax.getText();
            double costoHoraEstacion = Double.parseDouble(lbCostoxHora.getText());

            String idPDC = lbIdPDC.getText();
            String conectorPDC = lbConectorPDC.getText();
            String estadoPDC = lbEstadoPDC.getText();

            boolean disponible = false;

            RadioButton seleccionado = (RadioButton) opcionesGroup.getSelectedToggle();

            if (seleccionado != null) {
                // Obtenemos el texto seleccionado
                String textoSeleccionado = seleccionado.getText();

                // Convertimos "Sí" a true y "No" a false
                disponible = textoSeleccionado.equals("Sí");
            } else {
                System.out.println("No hay ninguna opción seleccionada");
            }

            Mantenimiento[] listaMantenimiento = new Mantenimiento[9];

            String idEquipo = lbIdEquipo.getText();
            double potenciaEquipo = Double.parseDouble(lbPotenicaEquipo.getText());
            String tipoEquipo = lbtipoequipo.getText();
            double voltajeEquipo = Double.parseDouble(lbVoltajeMax.getText());
            String sistemaEnfriamiento = lbSdeE.getText();
            double capacidadBateria = Double.parseDouble(lbCapacidadMAx.getText());

            String proteccion = "No";

            RadioButton seleccionadoProteccion = (RadioButton) opcionesGroup.getSelectedToggle();

            if (seleccionado != null) {
                // Obtenemos el texto seleccionado
                String textoSeleccionado = seleccionadoProteccion.getText();

                // Convertimos "Sí" a true y "No" a false
                proteccion = "Si";
            } else {
                System.out.println("No hay ninguna opción seleccionada");
            }

            EquipoUltra equipoUno = new EquipoUltra(idEquipo, potenciaEquipo, tipoEquipo, voltajeEquipo, sistemaEnfriamiento, capacidadBateria, proteccion, listaMantenimiento);
            PuntoDeCarga pdcUno = new PuntoDeCarga(idPDC, disponible, conectorPDC, estadoPDC, equipoUno);

            listaPDC[0] = pdcUno;

            Estacion_E_Rapida estacionUno = new Estacion_E_Rapida(nombreEstacion, idEstacion, ubicacionEstacion, estadoEstacion, capacidadEstacion, listaPDC, tiempoEstacion, costoHoraEstacion);

            System.out.println(crud.create(estacionUno));
            System.out.println("Lectura general" + Arrays.toString(crud.readAll()));

            //op.serializar(crud.readAll(), path, file);
            System.out.println("Estacion Ultra = " + estacionUno);

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_PRINCIPAL));
                Parent nuevaVista = loader.load();

                Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stageActual.getScene().setRoot(nuevaVista);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @FXML
    void initialize() {
        assert btCrear != null : "fx:id=\"btCrear\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert cbPDC != null : "fx:id=\"cbPDC\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbCapacidadEstacion != null : "fx:id=\"lbCapacidadEstacion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbCapacidadMAx != null : "fx:id=\"lbCapacidadMAx\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbConectorPDC != null : "fx:id=\"lbConectorPDC\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbCostoxHora != null : "fx:id=\"lbCostoxHora\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbEstacionNombre != null : "fx:id=\"lbEstacionNombre\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbEstadoEstacion != null : "fx:id=\"lbEstadoEstacion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbEstadoPDC != null : "fx:id=\"lbEstadoPDC\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbIdEquipo != null : "fx:id=\"lbIdEquipo\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbIdEstacion != null : "fx:id=\"lbIdEstacion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbIdPDC != null : "fx:id=\"lbIdPDC\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbNivelMax != null : "fx:id=\"lbNivelMax\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbPotenicaEquipo != null : "fx:id=\"lbPotenicaEquipo\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbSdeE != null : "fx:id=\"lbSdeE\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbTiempoCarga != null : "fx:id=\"lbTiempoCarga\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbUbicacionEstacion != null : "fx:id=\"lbUbicacionEstacion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbVoltajeMax != null : "fx:id=\"lbVoltajeMax\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert lbtipoequipo != null : "fx:id=\"lbtipoequipo\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert rbNo != null : "fx:id=\"rbNo\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert rbNoProteccion != null : "fx:id=\"rbNoProteccion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert rbYes != null : "fx:id=\"rbYes\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";
        assert rbYesProteccion != null : "fx:id=\"rbYesProteccion\" was not injected: check your FXML file 'FormEstacionUltra.fxml'.";

        rbNo.setToggleGroup(opcionesGroup);
        rbYes.setToggleGroup(opcionesGroup);
        rbNoProteccion.setToggleGroup(opcionesGroupProteccion);
        rbYesProteccion.setToggleGroup(opcionesGroupProteccion);
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
