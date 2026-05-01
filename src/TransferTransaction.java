public class TransferTransaction extends Transaction {

    private String mode; // NEFT / IMPS

    public TransferTransaction(int txnId, int amount, String mode) {
        super(txnId, amount);
        this.mode = mode;
    }

    @Override
    public void process(Account acc) {

        if (acc.withdraw(amount)) {

            if (mode.equalsIgnoreCase("NEFT")) {
                System.out.println("Transfer via NEFT (2-3 hours)"); // slow process
            } else {
                System.out.println("Transfer via IMPS (Instant)"); // fast process
            }

            System.out.println("Transfer Succcessful");

        } else {
            System.out.println("Insufficient Baalance");
        }
    }
}