package co.edu.poli.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    private TableColumn<?, ?> tbColumnAlertas;

    @FXML
    private TableColumn<?, ?> tbColumnCapacidad;

    @FXML
    private TableColumn<?, ?> tbColumnEstado;

    @FXML
    private TableColumn<?, ?> tbColumnID;

    @FXML
    private TableColumn<?, ?> tbColumnNombre;

    @FXML
    private TableView<?> tbEstaciones;

    @FXML
    private TextField txIDEstacion;

    @FXML
    private SplitPane viewMain;

}
