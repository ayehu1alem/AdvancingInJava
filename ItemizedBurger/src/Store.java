import java.util.ArrayList;
import java.util.List;

public class Store {
    public static <Item> void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.addTopping("Ketchup", "Mayo", "Bacon", "cheese");
        System.out.println(regularMeal);

        System.out.println(" - ".repeat(10));

        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);

        System.out.println();
        System.out.println("My Pig Latin Name");
        addPigLatinName((List<? extends Meal>) regularMeal);

    }


    public static void addPigLatinName(List<? extends Meal> list) {
        class PigLatinName extends Meal implements Comparable<Meal>{
            private String latinName;
            private Meal originalInstance;

            public PigLatinName(String latinName, Meal originalInstance) {
                this.latinName = latinName;
                this.originalInstance = originalInstance;
            }

            @Override
            public int compareTo(Meal o) {
                return latinName.indexOf(o.originalInstance);
            }

            @Override
            public String toString() {
                return super.toString() + " \t" + originalInstance.toString() + " " + latinName;
            }
        }

        List<PigLatinName> pigLatin = new ArrayList<>(list.size());
        for (var item : list) {
            try {
                String name = Meal.getOriginalInstance();
                String pigName = name.substring(1) + name.charAt(0) + " IT";
                pigLatin.add(new PigLatinName(pigName, item));
            }catch(ClassCastException e){
                System.out.println(e.getMessage());
            }
        }

        for(PigLatinName dItem: pigLatin){
            System.out.println(dItem);
        }
    }


}
