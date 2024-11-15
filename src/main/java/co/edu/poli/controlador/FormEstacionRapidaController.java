package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import co.edu.poli.modelo.*;
import co.edu.poli.utilities.Paths;
import co.edu.poli.vista.Estacion_E_Normal;
import co.edu.poli.vista.Estacion_E_Rapida;
import co.edu.poli.vista.ImplementacionOperacion;
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
    private Button btCrear;

    @FXML
    private ComboBox<PuntoDeCarga> cbPDC;

    @FXML
    private TextField lbCapacidadEstacion;

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
    private TextField lbPotenicaEquipo;

    @FXML
    private TextField lbTiempoCarga;

    @FXML
    private TextField lbTiempodeCargaEquipo;

    @FXML
    private TextField lbUbicacionEstacion;

    @FXML
    private TextField lbtipoequipo;

    @FXML
    private TextField lbtipoequipo2;

    @FXML
    private RadioButton rbNo;

    @FXML
    private RadioButton rbYes;

    private ToggleGroup opcionesGroup = new ToggleGroup();

    String path = " ";
    String file = "TextNoBinary.txt";

    ImplementacionOperacion crud = new ImplementacionOperacion();
    ImplementacionOperacion op = new ImplementacionOperacion();

    Mantenimiento[] listaMantenimiento = new Mantenimiento[9];
    EquipoRapido equipoUnoRapido = new EquipoRapido("WERRT67", 120.0, "Rapido", 90, "CSS", listaMantenimiento);
    EquipoRapido equipoDosRapido = new EquipoRapido("ASDFG123", 130.0, "Rapido", 85, "Sistema de Enfriamiento dos", listaMantenimiento);
    EquipoRapido equipoTresRapido = new EquipoRapido("GHJKL456", 115.0, "Rapido", 95, "Sistema de Enfriamiento tres", listaMantenimiento);

    PuntoDeCarga pdCRapido = new PuntoDeCarga("UTYTIO9887", true, "Rapido", "Medio", equipoUnoRapido);
    PuntoDeCarga pdCRapidoDos = new PuntoDeCarga("BNMV987", false, "Rapido", "Alto", equipoDosRapido);
    PuntoDeCarga pdCRapidoTres = new PuntoDeCarga("LKJHG321", true, "Rapido", "Bajo", equipoTresRapido);


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
            double costoHoraEstacion = Double.parseDouble(lbCostoxHora.getText());

            Estacion_E_Rapida estacionUno = new Estacion_E_Rapida(nombreEstacion, idEstacion, ubicacionEstacion, estadoEstacion, capacidadEstacion, listaPDC, tiempoEstacion, costoHoraEstacion);

            System.out.println(crud.create(estacionUno));
            System.out.println("Lectura general" + Arrays.toString(crud.readAll()));
            //op.serializar(crud.readAll(), path, file);

            System.out.println("estacion Rapida = " + estacionUno);

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
            int tiempoCarga = Integer.parseInt(lbTiempodeCargaEquipo.getText());
            String tipoConectro = lbtipoequipo2.getText();

            EquipoRapido equipoUno = new EquipoRapido(idEquipo, potenciaEquipo, tipoEquipo, tiempoCarga, tipoConectro, listaMantenimiento);
            PuntoDeCarga pdcUno = new PuntoDeCarga(idPDC, disponible, conectorPDC, estadoPDC, equipoUno);

            listaPDC[0] = pdcUno;

            Estacion_E_Rapida estacionUno = new Estacion_E_Rapida(nombreEstacion, idEstacion, ubicacionEstacion, estadoEstacion, capacidadEstacion, listaPDC, tiempoEstacion, costoHoraEstacion);

            System.out.println(crud.create(estacionUno));
            System.out.println("Lectura general" + Arrays.toString(crud.readAll()));
            //op.serializar(crud.readAll(), path, file);

            System.out.println("Estacion Rapida = " + estacionUno);

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
    }

    @FXML
    void initialize() {
        assert btCrear != null : "fx:id=\"btCrear\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert cbPDC != null : "fx:id=\"cbPDC\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbCapacidadEstacion != null : "fx:id=\"lbCapacidadEstacion\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbConectorPDC != null : "fx:id=\"lbConectorPDC\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbCostoxHora != null : "fx:id=\"lbCostoxHora\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbEstacionNombre != null : "fx:id=\"lbEstacionNombre\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbEstadoEstacion != null : "fx:id=\"lbEstadoEstacion\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbEstadoPDC != null : "fx:id=\"lbEstadoPDC\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbIdEquipo != null : "fx:id=\"lbIdEquipo\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbIdEstacion != null : "fx:id=\"lbIdEstacion\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbIdPDC != null : "fx:id=\"lbIdPDC\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbPotenicaEquipo != null : "fx:id=\"lbPotenicaEquipo\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbTiempoCarga != null : "fx:id=\"lbTiempoCarga\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbTiempodeCargaEquipo != null : "fx:id=\"lbTiempodeCargaEquipo\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbUbicacionEstacion != null : "fx:id=\"lbUbicacionEstacion\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbtipoequipo != null : "fx:id=\"lbtipoequipo\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert lbtipoequipo2 != null : "fx:id=\"lbtipoequipo2\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert rbNo != null : "fx:id=\"rbNo\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";
        assert rbYes != null : "fx:id=\"rbYes\" was not injected: check your FXML file 'FormEstacionRapida.fxml'.";

        rbNo.setToggleGroup(opcionesGroup);
        rbYes.setToggleGroup(opcionesGroup);
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
