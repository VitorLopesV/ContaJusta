package br.com.contajusta.controller;

import br.com.contajusta.RegisterManager;
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

    RegisterManager registerManager = RegisterManager.getInstance();

    /**
     * Divite o valor de forma igualitária
     *
     * @param event clique no botão divisão justa
     */
    @FXML
    void divideEqually(ActionEvent event) {
        SplitBillInfo fairDivision = new SplitBillInfo();
        try {
            fairDivision.setAccountValue(Double.parseDouble(this.accountValue.getText()));
            fairDivision.setQuantityPeople(Integer.parseInt(this.people.getText()));
        } catch (NumberFormatException e) {
            FXMLControllerUtil.showInformation(Alert.AlertType.ERROR, AppConstants.ERROR_MESSAGE,
                    AppConstants.INVALID_VALUE_MASSAGE);
            this.accountValue.clear();
            this.people.clear();
        }
        String msg = AppConstants.PAID_VALUE_MESSAGE + fairDivision.divide(fairDivision.getAccountValue(),
                fairDivision.getQuantityPeople());
        FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.MAIN_INTERFACE_TITLE, msg);

        fairDivision.setMode(AppConstants.MAIN_INTERFACE_TITLE);
        fairDivision.setDate(LocalDate.now());

        registerManager.setRegisters(new SplitBillInfo(fairDivision.getMode(), fairDivision.getAccountValue(),
                fairDivision.getQuantityPeople(), fairDivision.getPaidValue(), fairDivision.getDate()));
    }

    /**
     * Abre a interface do histórico
     *
     * @param event clique no botão "histórico"
     */
    @FXML
    void opensHistoryInterface(ActionEvent event) {
        FXMLControllerUtil.changeInterface(AppConstants.HISTORY_INTERFACE_PATH, AppConstants.HISTORY_INTERFACE_TITLE,
                historyButton);
    }

    /**
     * Abre a interface de roleta russa
     *
     * @param event clique no botão "roleta russa"
     */
    @FXML
    void opensRussianRouletteInterface(ActionEvent event) {
        SplitBillInfo russianRoulette = new SplitBillInfo();
        russianRoulette.setAccountValue(Double.parseDouble(this.accountValue.getText()));
        russianRoulette.setMode(AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE);
        russianRoulette.setDate(LocalDate.now());

        registerManager.setRegisters(new SplitBillInfo(russianRoulette.getMode(), russianRoulette.getAccountValue(), 0,
                russianRoulette.getAccountValue(), russianRoulette.getDate()));

        FXMLControllerUtil.changeInterface(AppConstants.RUSSIAN_ROULETTE_INTERFACE_PATH,
                AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE, russianRouletteButton);
    }

    /**
     * Informa ao utilizador como funciona o modo divisão justa
     *
     * @param event clique no "botão como funciona"
     */
    @FXML
    void tellYouHowItWorks(ActionEvent event) {
        FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.HOW_WORKS_TITLE,
                AppConstants.HOW_WORKS_FAIR_DIVISION);
    }
}

