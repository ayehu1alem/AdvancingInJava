import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product){}

public class Main {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350, "Oil on canvas"));
        storeProducts.add(new ArtObject("Watercolor Painting", 1200, "Without Oil on canvas"));
        storeProducts.add(new Furnitures("Table", 2000, "Wooden"));
        storeProducts.add(new Furnitures("Chair", 1000, "Wooden"));
//        listProducts();
//
        System.out.println("\nOrder 1: ");
        var order1 = new ArrayList<OrderItem>();
        addItem(order1, 0, 1);
        addItem(order1, 1, 2);
        printOrder(order1);


        System.out.println("\nOrder 2: ");
        var order2 = new ArrayList<OrderItem>();
        addItem(order2, 2, 1);
        addItem(order2, 3, 2);
        printOrder(order2);

    }

    public static void listProducts(){
        for(var item : storeProducts){
            System.out.println(" - ".repeat(25));
            item.showDetails();
        }
    }

    public static void addItem(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;

        for(var item : order){
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }

        System.out.println(String.format("Sales Total: $%2.2f", salesTotal));
    }
}
