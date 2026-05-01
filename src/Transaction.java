public abstract class Transaction {

    protected int txnId;

    protected int amount;

     public Transaction(int txnId, int amount) {
            this.txnId = txnId;
        this.amount = amount;
    }

      public abstract void process(Account acc);

    // display method add pannrom
    public void display() {
             System.out.println("Txn ID: " + txnId + " Amt: " + amount);
    }
}