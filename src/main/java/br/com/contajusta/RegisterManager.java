package br.com.contajusta;

import br.com.contajusta.model.SplitBillInfo;

import java.util.ArrayList;
import java.util.List;

/** Singleton que armazena registros do sistema. */
public class RegisterManager {

    private static RegisterManager instance;

    private List<SplitBillInfo> registers;

    private RegisterManager() {
        registers = new ArrayList<>();
    }

    public static RegisterManager getInstance() {
        if (instance == null) {
            instance = new RegisterManager();
        }
        return instance;
    }

    public List<SplitBillInfo> getRegisters() {
        return registers;
    }

    public void setRegisters(SplitBillInfo splitBillInfo) {
        registers.add(splitBillInfo);
    }
}
