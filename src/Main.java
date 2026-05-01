import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // accountNumber holderName balance pin

        long accNo = sc.nextInt();

        String name = sc.next();
        int balance = sc.nextInt();
        int pin = sc.nextInt();

        Account acc = new Account(accNo, name, balance, pin);

        // authentication 3 attempts
        boolean authenticated = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("enter PIN:");
            int enteredPin = sc.nextInt();

            if (acc.authenticate(enteredPin)) {
                authenticated = true;
                break;
            }
        }

        if (!authenticated) return; // fail na stop

        System.out.println("Login Successful");

        System.out.println("Balance: " + acc.getBalance());

        System.out.println("1.Depossit 2.withdraw 3.Traansfer");

        int choice = sc.nextInt();

        System.out.println("Enter amnt:");
        int amount = sc.nextInt();

        Transaction t = null; // parent reference (polymorphism)

        switch (choice) {

            case 1:
                t = new DepositTransaction(1, amount);
                break;

            case 2:
                t = new WithdrawTransaction(2, amount);
                break;

            case 3:
                System.out.println("Enter mode (NEFT/IMPS):");
                String mode = sc.next();
                t = new TransferTransaction(3, amount, mode);
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        // polymorphism: same method different behavior
         t.process(acc);

        System.out.println("Updated Balance: " + acc.getBalance());

        System.out.println("transaction Completed");


    }
}