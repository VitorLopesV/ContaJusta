package br.com.contajusta.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/** Classe auxiliar aos controladores. */
public abstract class FXMLControllerUtil {

    /**
     * Faz a mudança de ‘interface’ ao clicar num botão.
     *
     * @param path   caminho para nova ‘interface’.
     * @param title  título na nova interface.
     * @param button botão que será clicado.
     */
    public static void changeInterface(String path, String title, Button button) {
        try {
            FXMLLoader loader = new FXMLLoader(FXMLControllerUtil.class.getResource(path));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(title);

            Stage currentScreen = (Stage) button.getScene().getWindow();

            currentScreen.close();

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Abre um popup informando algo ao utilizador.
     *
     * @param type     tipo de alerta.
     * @param title    título do popup.
     * @param messsage informação que vai ser passada.
     */
    public static void showInformation(Alert.AlertType type, String title, String messsage) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(messsage);
        alert.show();
    }
}
