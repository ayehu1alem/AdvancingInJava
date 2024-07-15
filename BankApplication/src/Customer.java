import java.util.ArrayList;


//ArrayList<Double> transactions
//String customerName
//
public class Customer {
    private String customerName;
    private ArrayList<Double> transaction;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transaction = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transaction.add(amount);
    }
    public ArrayList<Double> getTransaction(){
        return transaction;
    }
    public String getName(){
        return customerName;
    }

}
