import java.util.ArrayList;
import java.util.List;

public class Meal {
    protected static int originalInstance;
    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;
    private double conversionRate;

    public Meal(){
        this(1);
    }

    public Meal(double conversionRate){
        this.conversionRate = conversionRate;
        burger = new Burger("regular");
        drink = new Item("soft drink", "coke");
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal(){
        return burger.getPrice() + drink.price + side.price;
    }

    public static  String getOriginalInstance(){
        return "  " + originalInstance;
    }

    @Override
    public String toString(){
        System.out.println("-".repeat(30));
        return "%s%n%s%n%s%n%26s$%5.2f".formatted(burger, drink, side, "Total Due: ", getTotal());
    }

    public void addTopping(String... selectedTopping) {
        burger.addTopping(selectedTopping);
    }





    public class Item {
        private String name;
        private String typeName;
        private String type;
        private double price;


        public Item(String name, String type) {
            this(name, type, type.equals("burger")? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        public String getName(){
            return typeName;
        }
        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }



    }

    private class Burger extends Item {
        private enum Extra{KETCHUP, MAYO, AVOCADO, BACON, CHEESE;

            private double getPrice(){
                return switch(this){
                    case KETCHUP -> 0.25;
                    case MAYO -> 0.50;
                    case AVOCADO -> 0.75;
                    case CHEESE -> 1.00;
                    default -> 0;
                };
            }
        }

        Burger(String name){
            super(name, "burger", 5.0);
        }

        private List<Item> toppings = new ArrayList<>();
        public double getPrice() {

            double total = super.price;
            for (Item topping : toppings) {
                total += topping.price;
            }
            return total;
        }

        private void addTopping(String... selectedToppings) {

            for (String selectedTopping : selectedToppings) {
                try {
                    Extra extra = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(extra.name(), "TOPPING",
                            extra.getPrice()));
                } catch (IllegalArgumentException ie) {
                    System.out.println("Sorry, we don't have " + selectedTopping.toUpperCase() + " topping in our menu!!");
                }
            }
        }

        @Override
        public String toString() {

            StringBuilder itemized = new StringBuilder(super.toString());
            for (Item topping : toppings) {
                itemized.append("\n");
                itemized.append(topping);
            }

            return itemized.toString();
        }
    }




}
