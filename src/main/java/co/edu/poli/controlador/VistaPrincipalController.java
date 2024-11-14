package co.edu.poli.controlador;

import co.edu.poli.modelo.Estacion;
import co.edu.poli.utilities.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class VistaPrincipalController {

    @FXML
    private Button btAlertas;

    @FXML
    private Button btBusacarEstacionID;

    @FXML
    private Button btCrearEstacion;

    @FXML
    private Button btEditarEstacion;

    @FXML
    private Button btEliminarEstacion;

    @FXML
    private Button btEstaciones;

    @FXML
    private Button btMantenimiento;

    @FXML
    private Button btReportes;

    @FXML
    private Button btSalir;

    @FXML
    private AnchorPane sideMenu;

    @FXML
    private AnchorPane sideOutlet;

    @FXML
    private TableColumn<Estacion, Boolean> tbColumnAlertas;

    @FXML
    private TableColumn<Estacion, Integer> tbColumnCapacidad;

    @FXML
    private TableColumn<Estacion, String> tbColumnEstado;

    @FXML
    private TableColumn<Estacion, String> tbColumnID;

    @FXML
    private TableColumn<Estacion, String> tbColumnNombre;

    @FXML
    private TableView<Estacion> tbEstaciones;

    @FXML
    private TextField txIDEstacion;

    @FXML
    private SplitPane viewMain;

    private int selection;

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    @FXML
    void buscarId(ActionEvent event) {

    }

    @FXML
    void estacionEliminar(ActionEvent event) {

    }

    @FXML
    void formCrear(ActionEvent event) {

        int  eleccion = selection;

        if (eleccion == 2){

            try {
                // 1. Cargar la nueva vista para el panel derecho desde el archivo FXML
                FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_ESTACION_NORMAL));
                Node nuevoContenidoDerecho = loader.load();

                // 2. Reemplazar el contenido del panel derecho en el SplitPane
                viewMain.getItems().set(1, nuevoContenidoDerecho); // La posición 1 corresponde al panel derecho
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                // 1. Cargar la nueva vista para el panel derecho desde el archivo FXML
                FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.VIEW_CREAR));
                Node nuevoContenidoDerecho = loader.load();

                // 2. Reemplazar el contenido del panel derecho en el SplitPane
                viewMain.getItems().set(1, nuevoContenidoDerecho); // La posición 1 corresponde al panel derecho
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void crearNormal(ActionEvent event) {

    }
    @FXML
    void formEditar(ActionEvent event) {

    }

    @FXML
    void logout(ActionEvent event) {

    }

    @FXML
    void viewAlertas(ActionEvent event) {

    }

    @FXML
    void viewEstaciones(ActionEvent event) {

    }

    @FXML
    void viewMantenimiento(ActionEvent event) {

    }

    @FXML
    void viewReportes(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btAlertas != null : "fx:id=\"btAlertas\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btBusacarEstacionID != null : "fx:id=\"btBusacarEstacionID\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btCrearEstacion != null : "fx:id=\"btCrearEstacion\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btEditarEstacion != null : "fx:id=\"btEditarEstacion\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btEliminarEstacion != null : "fx:id=\"btEliminarEstacion\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btEstaciones != null : "fx:id=\"btEstaciones\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btMantenimiento != null : "fx:id=\"btMantenimiento\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btReportes != null : "fx:id=\"btReportes\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert btSalir != null : "fx:id=\"btSalir\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert sideMenu != null : "fx:id=\"sideMenu\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert sideOutlet != null : "fx:id=\"sideOutlet\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert tbColumnAlertas != null : "fx:id=\"tbColumnAlertas\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert tbColumnCapacidad != null : "fx:id=\"tbColumnCapacidad\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert tbColumnEstado != null : "fx:id=\"tbColumnEstado\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert tbColumnID != null : "fx:id=\"tbColumnID\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert tbColumnNombre != null : "fx:id=\"tbColumnNombre\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert tbEstaciones != null : "fx:id=\"tbEstaciones\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert txIDEstacion != null : "fx:id=\"txIDEstacion\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";
        assert viewMain != null : "fx:id=\"viewMain\" was not injected: check your FXML file 'VistaPrincipal.fxml'.";

    }

}
