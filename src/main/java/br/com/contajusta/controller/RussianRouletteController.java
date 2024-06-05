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

    List<String> participantsNames = new ArrayList<>();

    @FXML
    void backHome(ActionEvent event) {
        changeInterface(AppConstants.MAIN_INTERFACE_PATH, AppConstants.MAIN_INTERFACE_TITLE, buttonBack);
    }

    @FXML
    void help(ActionEvent event) {
        FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.RUSSIAN_ROULETTE_INTERFACE_TITLE,
                AppConstants.HOW_WORKS_RUSSIAN_ROULETTE);
    }

    @FXML
    void luckyName(ActionEvent event) {
        SplitBillInfo splitBillInfo = new SplitBillInfo();
        RegisterManager registerManager = RegisterManager.getInstance();
        this.addParticipants();
        if (participantsNames.size() >= 2) {
            Random prizeDrawRandom = new Random();
            int winName = prizeDrawRandom.nextInt(participantsNames.size());
            FXMLControllerUtil.showInformation(Alert.AlertType.INFORMATION, AppConstants.GIVEAWAY_MESSAGE,
                    AppConstants.MESSAGE_FROM_THE_WINNING_PARTICIPANT + participantsNames.get(winName).toUpperCase());

            splitBillInfo.setQuantityPeople(participantsNames.size());

            for (int i = 0; i < registerManager.getRegisters().size(); i++) {
                if (registerManager.getRegisters().get(i).getQuantityPeople()==0) {
                    registerManager.getRegisters().get(i).setQuantityPeople(splitBillInfo.getQuantityPeople());
                }
            }
        } else {
            FXMLControllerUtil.showInformation(Alert.AlertType.WARNING, AppConstants.WARNING_MESSAGE,
                    AppConstants.INSUFFICIENT_NUMBER_OF_PARTICIPANTS);
        }

    }

    /**
     * Adiona os participantes que irão participar do sorteio.
     */
    public void addParticipants() {
        TextField[] participants = {participantName1, participantName2, participantName3, participantName4,
                participantName5, participantName6, participantName7, participantName8, participantName9,
                participantName10};

        for (TextField participant : participants) {
            if (!participant.getText().isEmpty()) {
                participantsNames.add(participant.getText());
            }
        }
    }
}