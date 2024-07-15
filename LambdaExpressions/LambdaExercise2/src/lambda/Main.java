package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main {

    /*
    *           |Interface Name         |  Method Signature  |
    *
    *           |Function<T, R>         | R apply(T t)       |   *
    *           |BiFunction<T, U, R>    | R apply(T t, U u)  |   *
     *          |UnaryOperator<T>       | T apply(T t)       |   *
     *          |BiOperator<T>          | T apply(T t, T u)  |   *
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "Delta"));
        for(String s : list){
            System.out.println(s);
        }

        System.out.println();
        list.forEach(s -> System.out.println(s));
        System.out.println();
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(myString + "  means " + first);
        });

        int result = calculator(Integer::sum, 5, 6);
        int result2 = calculator((a, b) -> a * b, 5, 6);
        //int result3 = calculator((String a, String b) -> a + " " + b, "Raphael", "Santos");



        var coords = Arrays.asList(
                new double[]{47.3160, -122.2140},
                new double[]{57.3160, -222.2140},
                new double[]{67.3160, -322.2140},
                new double[]{77.3160, -422.2140});
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        System.out.println("===+++=================");

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("Coordinates: %s, %s%n", lat, lng);

        var firstPoint = coords.get(0);
        proccesspoint(firstPoint[0], firstPoint[1], p1);
        System.out.println("===+++=================");
        coords.forEach(s -> proccesspoint(s[0], s[1], p1));
        System.out.println();

        coords.forEach(s -> proccesspoint(s[0], s[1],
                (lat, lng) ->
                        System.out.printf("[lat:%.3s  lon:%.3s]%n", lat, lng)));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.addAll(List.of("echo", "forever", "earnest"));
        list.forEach(System.out::println);
        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println(list);
        list.removeIf(s -> s.startsWith("e"));
        System.out.println();
        list.forEach(System.out::println);

        String[] str = new String[10];
        System.out.println(Arrays.toString(str));
        Arrays.fill(str, " ");
        System.out.println(Arrays.toString(str));

        Arrays.setAll(str, (i) -> " " + (i + 1) + ". ");
        System.out.println(Arrays.toString(str));

        Arrays.setAll(str, (i) -> " " + (i + 1) + ". "
                + switch(i){
                    case 0 -> "Alemayehu";
                    case 1 -> "Raphael";
                    case 2 -> "Assefa";
                    default -> " ";
                });
        System.out.println();
        System.out.println(Arrays.toString(str));


        String[] names = {"Anna", "Sam", "Sebsibie", "Alemayehu", "Raphael", "Assefa"};
        String[] randomList = randomlySelectedValues(1, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));
    }

    public static <T> T calculator(Operations<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Result from our Operations: " + result);
        return result;
    }

    public static <T> T calculator2(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("Result from BinaryOperator: " + result);
        return result;
    }

    public static <T> void proccesspoint(T t1, T t2, BiConsumer<T, T> consumer){
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count,
                                                  String[] values,
                                                  Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for(int i=0; i<count; i++){
            selectedValues[i] = values[s.get()];
        }

        return selectedValues;
    }


}

