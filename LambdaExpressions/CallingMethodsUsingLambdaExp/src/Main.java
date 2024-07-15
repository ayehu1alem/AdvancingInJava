import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Bob", "Alice"};
        System.out.println(Arrays.toString(names));
        List<String> backedNames = Arrays.asList(names);
        backedNames.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(backedNames);

        System.out.println("===".repeat(25));
    }

}
