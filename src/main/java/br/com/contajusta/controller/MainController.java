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

    /**
     * Divite o valor de forma igualitária
     *
     * @param event clique no botão divisão justa
     */
    @FXML
    void divideEqually(ActionEvent event) {
        try{
            setAccountValue(Double.parseDouble(this.accountValue.getText()));
            setQuantityPeople(Integer.parseInt(this.people.getText()));
        }catch (NumberFormatException e){
            FXMLControllerUtil.showInformation(Alert.AlertType.ERROR, AppConstants.MESSAGE_ERROR, AppConstants.INVALID_VALUE_MASSAGE);
            setQuantityPeople(null);
            this.accountValue.clear();
            setQuantityPeople(null);
            this.people.clear();
        }
        if(getAccountValue() != null && getQuantityPeople() != null) {
            String msg = AppConstants.PAID_VALUE_MESSAGE + this.divide(getQuantityPeople(), getAccountValue());
           FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.MAIN_INTERFACE_TITLE, msg);
        }
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
     * Informa ao usuário como funciona o modo divisão justa
     *
     * @param event clique no "botão como funciona"
     */
    @FXML
    void tellYouHowItWorks(ActionEvent event) {
       FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.HOW_WORKS_TITLE, AppConstants.HOW_WORKS_FAIR_DIVISION);
    }

    /**
     * Divide o valor que vai ser pago
     *
     * @param person Quantidade de pessoas
     * @param value Valor total da conta
     * @return valor que vai ser pago
     */
    public double divide(int person, double value) {
        return value/person;
    }
}

