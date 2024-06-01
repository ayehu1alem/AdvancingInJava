public class Furnitures extends ProductForSale{

    public Furnitures(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.println("Type: " + type.toUpperCase() + " -  ".repeat(19 - type.length()) + "  was made in Bahir Dar, Ethiopia.");
        System.out.println("Price:        " + " -  ".repeat(25 - type.length()) + price);
        System.out.println("Description:  " + " -  ".repeat(25 - type.length()) + description);
    }
}
