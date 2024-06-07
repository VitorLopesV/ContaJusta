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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class MainController extends SplitBillInfo {

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

    public final RegisterManager registerManager = RegisterManager.getInstance();

    /**
     * Divite o valor de forma igualitária
     *
     * @param event clique no botão divisão justa
     */
    @FXML
    void divideEqually(ActionEvent event) {
        try {
            setAccountValue(Double.parseDouble(this.accountValue.getText()));
            setQuantityPeople(Integer.parseInt(this.people.getText()));

            BigDecimal bigDecimal = BigDecimal.valueOf(divide(getAccountValue(), getQuantityPeople())).setScale(2,
                    RoundingMode.HALF_UP);

            setPaidValue(bigDecimal.doubleValue());

            FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.MAIN_INTERFACE_TITLE,
                    AppConstants.PAID_VALUE_MESSAGE + getPaidValue());
        } catch (NumberFormatException e) {
            FXMLControllerUtil.showInformation(Alert.AlertType.ERROR, AppConstants.ERROR_MESSAGE,
                    AppConstants.INVALID_VALUE_MASSAGE);
            this.accountValue.clear();
            this.people.clear();
        }
        setMode(AppConstants.MAIN_INTERFACE_TITLE);
        setDate(LocalDate.now());

        this.registerManager.setRegisters(
                new SplitBillInfo(getMode(), getAccountValue(), getQuantityPeople(), getPaidValue(), getDate()));
    }

    /**
     * Abre a interface do histórico
     *
     * @param event clique no botão "histórico"
     */
    @FXML
    void opensHistoryInterface(ActionEvent event) {
        FXMLControllerUtil.changeInterface(AppConstants.HISTORY_INTERFACE_PATH, AppConstants.HISTORY_INTERFACE_TITLE,
                this.historyButton);
    }

    /**
     * Abre a interface de roleta russa
     *
     * @param event clique no botão "roleta russa"
     */
    @FXML
    void opensRussianRouletteInterface(ActionEvent event) {
        if (!this.accountValue.getText().isEmpty()) {
            setAccountValue(Double.parseDouble(this.accountValue.getText()));
            setMode(AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE);
            setDate(LocalDate.now());

            this.registerManager.setRegisters(
                    new SplitBillInfo(getMode(), getAccountValue(), 0, getAccountValue(), getDate()));

            FXMLControllerUtil.changeInterface(AppConstants.RUSSIAN_ROULETTE_INTERFACE_PATH,
                    AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE, this.russianRouletteButton);
        } else {
            FXMLControllerUtil.showInformation(Alert.AlertType.ERROR, AppConstants.ERROR_MESSAGE,
                    AppConstants.MESSAGE_VALUE_NOT_ENTERED);
        }

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

