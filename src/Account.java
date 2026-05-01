public class Account {
    private long accountNumber;
    private String holderName;
    private int balance;
    private int pin;

    private int attempts = 0; // evlo thadava wrong pin pota count
    private boolean locked = false; // account lock aagirucha illa nu check

    public Account(long accountNumber, String holderName, int balance, int pin) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        this.pin = pin;


    }

    public int getBalance() {
        return balance;  // current balance return panrom
    }

     public long getAccountNumber() {
        return accountNumber;
    }

    // Authentication method
     public boolean authenticate(int enteredPin) {

        if (locked)  {
            System.out.println("Accout Locked for 24 hours"); // already lock aana
            return false;
        }

        if (enteredPin == pin) {
            attempts  = 0; // correct na reset
            return true;
        } else {
            attempts++; // wrong na increment
            System.out.println("Wrong P.IN");

            if (attempts >= 3) {
                locked  = true; // 3 times wrong na lock
                  System.out.println("Account Lock for 24 hours");
            }
            return false;
        }
    }

    public void deposit(int amount) {
        balance += amount; // deposit na add pannuvom
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount; // enough balance irundha deduct
            return true;
        }
        return false; // illa na fail
    }

    public void overdraft(int amount) {
        balance -= amount; // overdraft na negative kuda pogum
        System.out.println("Overdraft used>>>");
    }


}