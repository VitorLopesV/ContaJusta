package br.com.contajusta.controller;

import br.com.contajusta.util.FXMLControllerUtil;
import br.com.contajusta.util.AppConstants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController extends FXMLControllerUtil {

    @FXML
    private TextField accountValue;

    @FXML
    private Button fairSplitButton;

    @FXML
    private Button historyButton;

    @FXML
    private Button informationButton;

    @FXML
    private TextField peaple;

    @FXML
    private Button russianRouletteButton;

    @FXML
    void divideEqually(ActionEvent event) {

    }

    @FXML
    void opensHistoryInterface(ActionEvent event) {
        changeInterface(AppConstants.HISTORY_INTERFACE_PATH, AppConstants.HISTORY_INTERFACE_TITLE, historyButton);
    }


    @FXML
    void opensRussianRouletteInterface(ActionEvent event) {
       changeInterface(AppConstants.RUSSIAN_ROULETTE_INTERFACE_PATH, AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE, russianRouletteButton);
    }

    @FXML
    void setAccountValue(ActionEvent event) {

    }

    @FXML
    void setAmountOfPeople(ActionEvent event) {

    }

    @FXML
    void tellYouHowItWorks(ActionEvent event) {
       showInformation(Alert.AlertType.INFORMATION, AppConstants.HOW_WORKS_TITLE, AppConstants.HOW_WORKS_FAIR_DIVISION);
    }
}

