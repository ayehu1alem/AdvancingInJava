import java.util.ArrayList;

//ArrayList<Customer> customers
//addCustomer(String name, double initialAmount)
//addAdditionalTransaction
//showListOfCustomers and showTransactions
//dataValidation

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;
    private ArrayList<Double> deposit;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }
    public String getBranchName(){
        return branchName;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }




    public Customer findCustomer(String customerName){
        for(int i=0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }

        return null;
    }


}
