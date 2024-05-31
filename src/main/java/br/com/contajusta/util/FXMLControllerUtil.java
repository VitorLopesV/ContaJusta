package br.com.contajusta.util;

import br.com.contajusta.model.LittleCow;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/** Classe auxiliar aos controladores. */
public class FXMLControllerUtil  extends LittleCow{

    /**
     * Faz a mudança de interface ao clicar em um botão.
     *
     * @param path caminho para nova interface.
     * @param title título na nova interface.
     * @param button botão que será clicado.
     */
    public static void changeInterface(String path, String title, Button button){
        try {
            FXMLLoader loader = new FXMLLoader(FXMLControllerUtil.class.getResource(path));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(title);

            Stage currentScreen  = (Stage) button.getScene().getWindow();

            currentScreen.close();

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Abre um popup informando algo ao usuário.
     *
     * @param type tipo de alerta.
     * @param title título do popup.
     * @param messsage informação que vai ser passada.
     */
    public static void showInformation(Alert.AlertType type, String title, String messsage){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(messsage);
        alert.show();
    }

    public static void setValueInTextField(TextField textField, String title, String msg){
        try {
            //(Double.parseDouble(textField.getText()));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(title);
            alert.setHeaderText(null);
            alert.setContentText(msg);
            alert.showAndWait();

            textField.clear();
        }
    }
}
