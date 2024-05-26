package br.com.contajusta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import br.com.contajusta.util.AppConstants;

public class MainApp extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(AppConstants.MAIN_INTERFACE_PATH));
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent, 1029, 584);
        stage.setTitle(AppConstants.MAIN_INTERFACE_TITLE);
        stage.setScene(scene);
        stage.show();

    }
}
