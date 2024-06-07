package br.com.contajusta.util;

/** Armazena os contantes da aplicação. */
public class AppConstants {

    /** Título da interface principal. */
    public static final String MAIN_INTERFACE_TITLE = "Divisão justa";

    /** Título da interface de histórico. */
    public static final String HISTORY_INTERFACE_TITLE = "Histórico";

    /** Título da interface da roleta russa. */
    public static final String RUSSIAN_ROULETTE_INTERFACE_TITLE = "Roleta Russa";

    /** Título do popup de como funciona. */
    public static final String HOW_WORKS_TITLE = "Como funciona?";

    /** Messagem de erro. */
    public static final String ERROR_MESSAGE = "ERRO";

    /** Messagem de aviso. */
    public static final String WARNING_MESSAGE = "Aviso";

    /** Messagem de sorteio. */
    public static final String GIVEAWAY_MESSAGE = "Sorteio";

    /** Mensgaem informando o vencedor do sorteio. */
    public static final String MESSAGE_FROM_THE_WINNING_PARTICIPANT = "O(a) participante premiado(a) foi o(a):\n\n";

    /** Mensagem de valor inválido. */
    public static final String INVALID_VALUE_MASSAGE = "O valor digitado é inválido";

    /** Mensagem informando que o valor da conta não foi inserido. */
    public static final String MESSAGE_VALUE_NOT_ENTERED = "O valor da conta não foi inserido.";

    /** Mensagem de número insuficientes de pessoas. */
        public static final String INSUFFICIENT_NUMBER_OF_PARTICIPANTS = "Você deve preencher pelo menos dois nomes antes de sortear.";

    /** Mensagem de valor a ser pago. */
    public static final String  PAID_VALUE_MESSAGE = "O valor pago por cada um será: R$ ";

    /** Menssagem de como funciona a divisão justa. */
    public static final String HOW_WORKS_FAIR_DIVISION = "Divisão justa consiste em pegar o valor total da conta e " +
            "dividir de forma justa";

    /** Menssagem de como funciona a roleta russa. */
    public static final String HOW_WORKS_RUSSIAN_ROULETTE = "Os participantes inserem seu nomes, haverá  um sorteio e um deles será  'premiado' e dever  pagar a conta sozinho.";

    /** Caminho para o arquivo fxml do histórico. */
    public static final String HISTORY_INTERFACE_PATH = "/br/com/contajusta/interface/historyInterface.fxml";

    /** Caminho para o arquivo fxml da ‘interface’ principal. */
    public static final String MAIN_INTERFACE_PATH = "/br/com/contajusta/interface/mainInterface.fxml";

    /** Caminho para o arquivo fxml da roleta russa. */
    public static final String RUSSIAN_ROULETTE_INTERFACE_PATH = "/br/com/contajusta/interface/russianRouletteInterface.fxml";
}
