public class BankAccount {
}

interface BankAccountProcess {
    public void transferMoney(BankAccount target, double amount);
}

class LocalBankAccount implements BankAccountProcess {

    public void transferMoney(BankAccount target, double amount) {
        // Local
    }
}

class InterBankAccount implements BankAccountProcess {

    public void transferMoney(BankAccount target, double amount) {
        // Inter
    }
}

class TransferProcess {
    BankAccountProcess process(String type) {
        if ("LOCAL".equals(type)) {
            return new LocalBankAccount();
        }
        if ("INTER".equals(type)) {
            return new LocalBankAccount();
        }
        throw new RuntimeException("NO NO NO");
    }
}

class Client {
    void start(String type, BankAccount target, int opts) {
        TransferProcess transferProcess = new TransferProcess();
        transferProcess.process("LOCAL").transferMoney(target, 1000);
        transferProcess.process("INTER").transferMoney(target, 500);
    }
    void startForLocal(BankAccount target, double amount) {
        new LocalBankAccount().transferMoney(target, amount);
    }
    void startForInter(BankAccount target, double amount) {
        new InterBankAccount().transferMoney(target, amount);
    }
}
