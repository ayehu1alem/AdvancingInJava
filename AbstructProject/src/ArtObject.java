public class ArtObject extends ProductForSale{

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.println("Type:         " + " - ".repeat(25 - type.length()) + type);
        System.out.println("Price:        " + " - ".repeat(25 - type.length()) + price);
        System.out.println("Description:  " + " - ".repeat(25 - type.length()) + description);
    }
}
