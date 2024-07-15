public class Main {
    public static void main(String[] args) {

        //Testing

        Bank bank = new Bank("Awash Bank");
        bank.addBranch("Tulu Dimtu");
        bank.addCustomer("Tulu Dimtu", "Alemayehu", 90_000.00);
        bank.addCustomer("Tulu Dimtu", "Mekonnen", 50_000.00);
        bank.addCustomer("Tulu Dimtu", "Yohannis", 10_000.00);

        bank.addBranch("Alem Bank");
        bank.addCustomer("Alem Bank", "Haddis", 10_000.00);
        bank.addCustomer("Alem Bank", "Beriso", 5_000.00);
        bank.addCustomer("Alem Bank", "Kuru", 1_000.00);


        //String branchName, String customerName, double amount
        bank.addCustomerTransaction("Tulu Dimtu", "Alemayehu", 10_000.00);
        bank.addCustomerTransaction("Tulu Dimtu", "Yohannis", 10_000.00);
        bank.addCustomerTransaction("Alem Bank", "Beriso",1_000.00);


        bank.listCustomers("Tulu Dimtu", true);
        bank.listCustomers("Alem Bank", true);



    }
}
