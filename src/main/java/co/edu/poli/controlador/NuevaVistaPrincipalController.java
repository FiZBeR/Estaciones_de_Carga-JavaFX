package co.edu.poli.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import co.edu.poli.application.App;
import co.edu.poli.modelo.Estacion;
import co.edu.poli.utilities.Paths;
import co.edu.poli.vista.Estacion_E_Normal;
import co.edu.poli.vista.Estacion_E_Rapida;
import co.edu.poli.vista.Estacion_E_Ultra;
import co.edu.poli.vista.ImplementacionOperacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableColumn<Estacion, Integer> columnCapacidad;

    @FXML
    private TableColumn<Estacion, String> columnEstado;

    @FXML
    private TableColumn<Estacion, String> columnEstadoPdC;

    @FXML
    private TableColumn<Estacion, String> columnID;

    @FXML
    private TableColumn<Estacion, String> columnNombre;

    @FXML
    private TableColumn<Estacion, String> columnUbi;

    @FXML
    private TableView<Estacion> infoTable;

    @FXML
    private TextField laID;

    @FXML
    private AnchorPane subViewMain;

    @FXML
    private AnchorPane viewMain;


    String path = " ";
    String file = "TextNoBinary.txt";

    ImplementacionOperacion op = new ImplementacionOperacion();
    ImplementacionOperacion crud = new ImplementacionOperacion();

    private ObservableList<Estacion> estacionesLista;



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

        Estacion estacion = infoTable.getSelectionModel().getSelectedItem();

        String id = estacion.getIdEstacion();

        if (estacion == null || id == null || id.equals(" ")){
            System.out.println("id = " + id);
        } else {
            crud.delete(id);
            actualizarTabla();
        }
    }

    @FXML
    void infoID(ActionEvent event) {
        //Estacion unicaID = crud.read(id);
    }

    @FXML
    void search(ActionEvent event) {
        String id = laID.getText();
        if (id == null || id.equals(" ")){
            System.out.println("id = " + id);
        }
        Estacion unicaId = crud.read(id);

        System.out.println("unicaId = " + unicaId);
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

        System.out.println("Nueva Vista" + Arrays.toString(op.getEstacion()));
        estacionesLista = FXCollections.observableArrayList(op.getEstacion());

        columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnID.setCellValueFactory(new PropertyValueFactory<>("idEstacion"));
        columnUbi.setCellValueFactory(new PropertyValueFactory<>("ubicacion"));
        columnEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        columnCapacidad.setCellValueFactory(new PropertyValueFactory<>("capacidad"));

        infoTable.setItems(estacionesLista);
    }

    private void actualizarTabla() {
        infoTable.getItems().clear();
        infoTable.getItems().addAll(op.getEstacion());
        infoTable.refresh();
    }

}
