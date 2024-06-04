package br.com.contajusta.controller;

import br.com.contajusta.model.SplitBillInfo;
import br.com.contajusta.util.AppConstants;
import br.com.contajusta.util.FXMLControllerUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class MainController {

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

    /**
     * Divite o valor de forma igualitária
     *
     * @param event clique no botão divisão justa
     */
    @FXML
    void divideEqually(ActionEvent event) {
        SplitBillInfo splitBillInfo = SplitBillInfo.getInstance();
        try {
            splitBillInfo.setAccountValue(Double.parseDouble(this.accountValue.getText()));
            splitBillInfo.setQuantityPeople(Integer.parseInt(this.people.getText()));
        } catch (NumberFormatException e) {
            FXMLControllerUtil.showInformation(Alert.AlertType.ERROR, AppConstants.ERROR_MESSAGE, AppConstants.INVALID_VALUE_MASSAGE);
            splitBillInfo.setAccountValue(null);
            this.accountValue.clear();
            splitBillInfo.setQuantityPeople(null);
            this.people.clear();
        }
        String msg = AppConstants.PAID_VALUE_MESSAGE + splitBillInfo.divide(splitBillInfo.getAccountValue(), splitBillInfo.getQuantityPeople());
        FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.MAIN_INTERFACE_TITLE, msg);

        splitBillInfo.setMode(AppConstants.MAIN_INTERFACE_TITLE);
        splitBillInfo.setDate(LocalDate.now());
    }

    /**
     * Abre a interface do histórico
     *
     * @param event clique no botão "histórico"
     */
    @FXML
    void opensHistoryInterface(ActionEvent event) {
        FXMLControllerUtil.changeInterface(AppConstants.HISTORY_INTERFACE_PATH, AppConstants.HISTORY_INTERFACE_TITLE, historyButton);
    }

    /**
     * Abre a interface de roleta russa
     *
     * @param event clique no botão "roleta russa"
     */
    @FXML
    void opensRussianRouletteInterface(ActionEvent event) {
        FXMLControllerUtil.changeInterface(AppConstants.RUSSIAN_ROULETTE_INTERFACE_PATH, AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE, russianRouletteButton);
    }

    /**
     * Informa ao utilizador como funciona o modo divisão justa
     *
     * @param event clique no "botão como funciona"
     */
    @FXML
    void tellYouHowItWorks(ActionEvent event) {
        FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.HOW_WORKS_TITLE, AppConstants.HOW_WORKS_FAIR_DIVISION);
    }
}

