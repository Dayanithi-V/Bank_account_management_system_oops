public class DepositTransaction extends Transaction {

    public DepositTransaction(int txnId, int amount) {
        super(txnId, amount);
    }

    @Override
    public void process(Account acc) {
        acc.deposit(amount); // deposit call pannrom
        System.out.println("Deposit Successful");
    }
}