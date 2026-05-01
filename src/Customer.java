import java.util.List; // to store multiple accounts

public class Customer {
        private int customerId;
    private String name;
        private String phone;
    private List<Account> accounts;

    public Customer(int customerId, String name, String phone, List<Account> accounts) {
           this.customerId = customerId;
        this.name = name;
             this.phone = phone;
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
               return accounts;
    }
}