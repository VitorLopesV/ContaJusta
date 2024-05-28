package br.com.contajusta.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import br.com.contajusta.util.FXMLControllerUtil;
import br.com.contajusta.util.AppConstants;

/** Controlador da interface de histórico. */
public class HistoricController extends FXMLControllerUtil {

    /** Tabela com valores das contas. */
    @FXML
    private TableColumn<?, ?> accountValue;

    /** Tabela com valores a serem pagos. */
    @FXML
    private TableColumn<?, ?> amountPaid;

    /** Tabela com as datas das divisões. */
    @FXML
    private TableColumn<?, ?> data;

    /** Tabela com o modo de divisão. */
    @FXML
    private TableColumn<?, ?> mode;

    /** Tabela com as quantidades de pessoas. */
    @FXML
    private TableColumn<?, ?> people;

    /** Botão de voltar. */
    @FXML
    private Button backButton;

    /**
     * retorna para a classe principal.
     *
     * @param event evento para que ação seja feita.
     */
    @FXML
    void back(ActionEvent event) {
        changeInterface(AppConstants.MAIN_INTERFACE_PATH, AppConstants.MAIN_INTERFACE_TITLE, backButton);
    }

    @FXML
    void getElements(ActionEvent event) {

    }

}
