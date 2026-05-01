import java.util.List;

public class MiniStatement {
    private int accountNumber;

    private List<Transaction> transactions;

      public MiniStatement(int accountNumber, List<Transaction> transactions) {
        this.accountNumber = accountNumber;

        this.transactions = transactions;
    }
    public void printStatement() {
           System.out.println("Mini Statnt for Accnt: " + accountNumber);
        for (Transaction t : transactions) {
            t.display();
        }
    }
}