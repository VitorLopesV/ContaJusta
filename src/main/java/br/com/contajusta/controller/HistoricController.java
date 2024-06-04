package br.com.contajusta.controller;

import br.com.contajusta.model.SplitBillInfo;
import br.com.contajusta.model.SplitBillInfoAux;
import br.com.contajusta.util.AppConstants;
import br.com.contajusta.util.FXMLControllerUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Date;

/** Controlador da ‘interface’ de histórico. */
public class HistoricController extends FXMLControllerUtil {

    @FXML
    private TableView<SplitBillInfoAux> billTable;

    /**
     * Tabela com valores das contas.
     */
    @FXML
    private TableColumn<SplitBillInfoAux, Double> accountValue;

    /**
     * Tabela com valores a serem pagos.
     */
    @FXML
    private TableColumn<SplitBillInfoAux, Double> amountPaid;

    /**
     * Tabela com as datas das divisões.
     */
    @FXML
    private TableColumn<SplitBillInfoAux, Date> date;

    /**
     * Tabela com o modo de divisão.
     */
    @FXML
    private TableColumn<SplitBillInfoAux, String> mode;

    /**
     * Tabela com as quantidades de pessoas.
     */
    @FXML
    private TableColumn<SplitBillInfoAux, Integer> people;

    /**
     * Botão de voltar.
     */
    @FXML
    private Button backButton;

    ArrayList<SplitBillInfoAux> dataList = new ArrayList<>();
    SplitBillInfo splitBillInfo = SplitBillInfo.getInstance();

    /**
     * Retorna para a classe principal.
     *
     * @param event evento para que ação seja feita.
     */
    @FXML
    void back(ActionEvent event) {
        changeInterface(AppConstants.MAIN_INTERFACE_PATH, AppConstants.MAIN_INTERFACE_TITLE, backButton);
    }

    @FXML
    public void initialize() {

        mode.setCellValueFactory(new PropertyValueFactory<>("mode"));
        accountValue.setCellValueFactory(new PropertyValueFactory<>("accountValue"));
        people.setCellValueFactory(new PropertyValueFactory<>("quantityPeople"));
        amountPaid.setCellValueFactory(new PropertyValueFactory<>("paidValue"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));

        dataList.add(new SplitBillInfoAux(splitBillInfo.getMode(),splitBillInfo.getAccountValue(),splitBillInfo.getQuantityPeople(),splitBillInfo.getPaidValue(),splitBillInfo.getDate()));

        billTable.getItems().setAll(dataList);
    }
}
