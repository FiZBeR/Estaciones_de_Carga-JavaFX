package co.edu.poli.application;

import co.edu.poli.utilities.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane load = FXMLLoader.load(getClass().getResource(Paths.VIEW_PRINCIPAL));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }
}
