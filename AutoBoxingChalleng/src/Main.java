import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){

    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<>(20));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {

        Customer newCustomer = new Customer("Sam", 200.25);
        System.out.println(newCustomer);


        Bank bank = new Bank("Alex");
        bank.addNewCustomer("Alemayehu", 9_000_000);

        System.out.println(bank);
    }
}


class Bank{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }

    public Customer getCusomers(String customerName) {
        for(var customer : customers){
            if(customer.name().equalsIgnoreCase(customerName))
                return customer;
        }

        System.out.printf("Customer (%s) is not found", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialBalance){
        if(getCusomers(customerName) == null){
            Customer customer = new Customer(customerName, initialBalance);
            customers.add(customer);

            System.out.println("New customer added:  " + customer);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}