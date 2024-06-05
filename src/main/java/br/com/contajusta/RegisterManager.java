package br.com.contajusta;

import br.com.contajusta.model.SplitBillInfo;

import java.util.ArrayList;
import java.util.List;

/** Singleton que armazena registros do sistema. */
public class RegisterManager {

    /** instância. */
    private static RegisterManager instance;

    /** Lista dos registros do sistema. */
    private List<SplitBillInfo> registers;

    /**
     * Cosntrutor.
     */
    private RegisterManager() {
        registers = new ArrayList<>();
    }

    /**
     * Cria a única instância da classe.
     *
     * @return instância da classe.
     */
    public static RegisterManager getInstance() {
        if (instance == null) {
            instance = new RegisterManager();
        }
        return instance;
    }

    /**
     * {@link #registers}
     *
     * @return registros.
     */
    public List<SplitBillInfo> getRegisters() {
        return registers;
    }

    /**
     * {@link #registers}
     *
     * @param splitBillInfo instância da classe SplitBillInfo.
     */
    public void setRegisters(SplitBillInfo splitBillInfo) {
        registers.add(splitBillInfo);
    }
}
