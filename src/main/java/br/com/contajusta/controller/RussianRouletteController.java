package br.com.contajusta.controller;

import br.com.contajusta.util.AppConstants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import br.com.contajusta.util.FXMLControllerUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RussianRouletteController extends FXMLControllerUtil {

    @FXML
    private Button buttonBack;

    @FXML
    private Button buttonHelp;

    @FXML
    private Button buttonLucky;

    @FXML
    private TextField participantName1;

    @FXML
    private TextField participantName2;

    @FXML
    private TextField participantName3;

    @FXML
    private TextField participantName4;

    @FXML
    private TextField participantName5;

    @FXML
    private TextField participantName6;

    @FXML
    private TextField participantName7;

    @FXML
    private TextField participantName8;

    @FXML
    private TextField participantName9;

    @FXML
    private TextField participantName10;


    @FXML
    void backHome(ActionEvent event) {
        changeInterface(AppConstants.MAIN_INTERFACE_PATH, AppConstants.MAIN_INTERFACE_TITLE, buttonBack);
    }

    @FXML
    void help(ActionEvent event) {
        Alert helpAlert = new Alert(Alert.AlertType.INFORMATION);
        helpAlert.setTitle("Como funciona a Roleta Russa?");
        helpAlert.setHeaderText(null);
        helpAlert.setContentText("Os participantes colocam seus nomes nos campos vazios, haverá um sorteio e um deles "+
                "será premiado e terá que pagar a conta sozinho. Mínimo de 1 participante e máximo de 10.   Deixe os campos que não for utilizar em branco.");
        helpAlert.showAndWait();    }

    @FXML
    void luckyName(ActionEvent event) {
        List<String> participantsNames = new ArrayList<>();
        // VERIFICA SE OS NOMES ESTÃO NA LISTA E ADICIONA NA LISTA
        if (!participantName1.getText().isEmpty())
        {
            participantsNames.add(participantName1.getText());
        }
        if (!participantName2.getText().isEmpty())
        {
            participantsNames.add(participantName2.getText());
        }
        if (!participantName3.getText().isEmpty())
        {
            participantsNames.add(participantName3.getText());
        }
        if (!participantName4.getText().isEmpty())
        {
            participantsNames.add(participantName4.getText());
        }
        if (!participantName5.getText().isEmpty())
        {
            participantsNames.add(participantName5.getText());
        }
        if (!participantName6.getText().isEmpty())
        {
            participantsNames.add(participantName6.getText());
        }
        if (!participantName7.getText().isEmpty())
        {
            participantsNames.add(participantName7.getText());
        }
        if (!participantName8.getText().isEmpty())
        {
            participantsNames.add(participantName8.getText());
        }
        if (!participantName9.getText().isEmpty())
        {
            participantsNames.add(participantName9.getText());
        }
        if (!participantName10.getText().isEmpty())
        {
            participantsNames.add(participantName10.getText());
        }
        // VERIFICA SE OS CAMPOS ESTÃO PREENCHIDOS
        if (!participantsNames.isEmpty())
        {
            Random sorteio = new Random();
            int winName = sorteio.nextInt(participantsNames.size());

            Alert winAlert = new Alert(Alert.AlertType.INFORMATION);
            winAlert.setTitle("Sorteio");
            winAlert.setHeaderText(null);
            winAlert.setContentText("O(a) participante premiado(a) foi o(a):\n\n" + participantsNames.get(winName).toUpperCase());
            winAlert.showAndWait();
        }
        else
        {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Erro");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Você deve preencher um dos campos antes de sortear.");
            errorAlert.showAndWait();
        }
    }
}
