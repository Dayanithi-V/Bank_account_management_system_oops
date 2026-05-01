public class WithdrawTransaction extends Transaction {

    public WithdrawTransaction(int txnId, int amount) {
        super(txnId, amount);
    }

    @Override
    public void process(Account acc) {

        // 1 lakh mela na manager approval venum
        if (amount > 100000) {
            System.out.println("Manager Approval need");
            return;
        }

        if (acc.withdraw(amount)) {
               System.out.println("Withdraaw Successful");
        } else {System.out.println("Insufficient Baalance");

            // overdraft allow pannrom
            acc.overdraft(amount);
        }
    }
}