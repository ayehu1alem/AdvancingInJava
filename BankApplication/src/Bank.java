import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;
    private Scanner scanner = new Scanner(System.in);

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branches != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch checkedBranch = findBranch(branchName);
        if(checkedBranch != null){
            return checkedBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for(int i=0; i<this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getBranchName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer detail for a branch " +branch.getBranchName());

            ArrayList<Customer> branchCustomer = branch.getCustomers();
            for(int i=0; i<branchCustomer.size(); i++){
                Customer customer = branchCustomer.get(i);
                System.out.println("Customer:  " + customer.getName() + "[" + (i + 1) + "]");

                if(showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransaction();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("[" + (j+1) + "]  Amount = " + transactions.get(j));
                    }
                }
            }

            return true;
        }
        else{
            return false;
        }

    }
}
