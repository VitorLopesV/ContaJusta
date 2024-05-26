package br.com.contajusta.controller;

import br.com.contajusta.util.AppConstants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import br.com.contajusta.util.FXMLControllerUtil;

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
    void backHome(ActionEvent event) {
        changeInterface(AppConstants.MAIN_INTERFACE_PATH, AppConstants.MAIN_INTERFACE_TITLE, buttonBack);
    }

    @FXML
    void help(ActionEvent event) {
        showInformation(Alert.AlertType.INFORMATION, AppConstants.HOW_WORKS_TITLE, AppConstants.HOW_WORKS_RUSSIAN_ROULETTE);
    }

    @FXML
    void luckyName(ActionEvent event) {

    }
}
