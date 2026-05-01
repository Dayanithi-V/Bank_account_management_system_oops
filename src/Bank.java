import java.util.List; // list of customers

public class Bank {
    private String bankCode;
    private String name;
    private List<Customer> customers;

    public Bank(String bankCode, String name, List<Customer> customers) {
        this.bankCode = bankCode;
        this.name = name;
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}