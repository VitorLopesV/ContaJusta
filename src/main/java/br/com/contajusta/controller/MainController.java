package br.com.contajusta.controller;

import br.com.contajusta.model.LittleCow;
import br.com.contajusta.util.AppConstants;
import br.com.contajusta.util.FXMLControllerUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController extends LittleCow{

    @FXML
    private TextField accountValue;

    @FXML
    private Button fairSplitButton;

    @FXML
    private Button historyButton;

    @FXML
    private Button informationButton;

    @FXML
    private TextField people;

    @FXML
    private Button russianRouletteButton;

    @FXML
    void divideEqually(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(AppConstants.MAIN_INTERFACE_TITLE);
        alert.setHeaderText(null);
        alert.setContentText("O valor pago por cada um será: " + this.divide(getQuantityPeople(),getAccountValue()));
        alert.show();

    }

    public double divide(int person, double value) {
        double test = value/person;
        return test;
    }

    @FXML
    void opensHistoryInterface(ActionEvent event) {
        FXMLControllerUtil.changeInterface(AppConstants.HISTORY_INTERFACE_PATH, AppConstants.HISTORY_INTERFACE_TITLE, historyButton);
    }


    @FXML
    void opensRussianRouletteInterface(ActionEvent event) {
      FXMLControllerUtil.changeInterface(AppConstants.RUSSIAN_ROULETTE_INTERFACE_PATH, AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE, russianRouletteButton);
    }

    @FXML
    void setAccountValue(ActionEvent event) {
        try {
            setAccountValue(Double.parseDouble(this.accountValue.getText()));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a valid integer.");
            alert.showAndWait();

            this.people.clear();
        }
    }

    @FXML
    void setAmountOfPeople(ActionEvent event) {
        try {
            setQuantityPeople(Integer.parseInt(this.people.getText()));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a valid integer.");
            alert.showAndWait();

            this.people.clear();
        }
    }

    @FXML
    void tellYouHowItWorks(ActionEvent event) {
       FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.HOW_WORKS_TITLE, AppConstants.HOW_WORKS_FAIR_DIVISION);
    }
}

