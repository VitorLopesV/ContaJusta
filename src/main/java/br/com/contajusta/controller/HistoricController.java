package br.com.contajusta.controller;

import br.com.contajusta.RegisterManager;
import br.com.contajusta.model.SplitBillInfo;
import br.com.contajusta.util.AppConstants;
import br.com.contajusta.util.FXMLControllerUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Date;

/** Controlador da ‘interface’ de histórico. */
public class HistoricController extends SplitBillInfo {

    @FXML
    private TableView<SplitBillInfo> billTable;

    @FXML
    private TableColumn<SplitBillInfo, Double> accountValue;

    @FXML
    private TableColumn<SplitBillInfo, Double> amountPaid;

    @FXML
    private TableColumn<SplitBillInfo, Date> date;

    @FXML
    private TableColumn<SplitBillInfo, String> mode;

    @FXML
    private TableColumn<SplitBillInfo, Integer> people;

    @FXML
    private Button backButton;

    RegisterManager registerManager = RegisterManager.getInstance();

    /**
     * Retorna para a classe principal.
     *
     * @param event evento para que ação seja feita.
     */
    @FXML
    void back(ActionEvent event) {
        FXMLControllerUtil.changeInterface(AppConstants.MAIN_INTERFACE_PATH, AppConstants.MAIN_INTERFACE_TITLE,
                backButton);
    }

    /**
     * Compo onde os registros do sistema são inseridos.
     */
    @FXML
    public void initialize() {
        mode.setCellValueFactory(new PropertyValueFactory<>("mode"));
        accountValue.setCellValueFactory(new PropertyValueFactory<>("accountValue"));
        people.setCellValueFactory(new PropertyValueFactory<>("quantityPeople"));
        amountPaid.setCellValueFactory(new PropertyValueFactory<>("paidValue"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));

        billTable.getItems().setAll(registerManager.getRegisters());
    }
}
