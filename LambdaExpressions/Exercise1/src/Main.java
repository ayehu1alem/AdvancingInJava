import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Alemayehu", "Haddis"),
                new Person("Yohannis", "Kurru"),
                new Person("Belay", "Yeshitila"),
                new Person("Behailu", "Yeshitila"),
                new Person("Mekonnen", "Beriso")));

        var comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.lastName());
            }
        };

        people.sort(comparator.reversed());
        System.out.println("Reversed Order:  " + people);


        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.lastName());
            }
        });

        System.out.println("Natural Order:  " + people);
        System.out.println("===== // ======");

        people.sort((o1, o2) -> o1.firstName().compareTo(o2.lastName()));
        System.out.println("Lambda Expiration:  " + people);
        System.out.println("===== // ======");
        System.out.println("===== // ======");


        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }
        var mixedComparator = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.firstName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.lastName());
            }
        };

        people.sort(mixedComparator);
        System.out.println(people);

    }
}
