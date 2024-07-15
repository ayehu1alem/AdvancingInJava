import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static jdk.internal.icu.text.UTF16.charAt;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Bob", "Samuel", "Alemayehu", "Anna", "Kibiye"};
        Arrays.setAll(names, i -> names[i].toUpperCase());
        Arrays.asList(names).forEach(s -> System.out.print(" " + s));
        System.out.println();
        System.out.println("--".repeat(15));

        List<String> backedNames = Arrays.asList(names);
        List<String> backedNames2 = new ArrayList<>(Arrays.asList(names));
        System.out.println("1. Backed Names: \n" + backedNames);
        System.out.println("2. Backed Names: \n" + backedNames2);
        System.out.println("==".repeat(15));

        backedNames.replaceAll(s -> s += " " + getReversed(s.split("")[0]));
        System.out.println("Backed Names get reversed: \n" + backedNames);
        System.out.println("--".repeat(15));

        backedNames.replaceAll(s -> s += getRandomChar('A', 'z') + " ");
        System.out.println("getRandomChar:  " + getRandomChar('A', 'z'));
        System.out.println("getRandomChar Output: \n" + backedNames);

        List<String> newList = new ArrayList<>(List.of(names));
        System.out.println("==".repeat(15));
//        newList.removeIf(s -> s.substring(0, s.indexOf("")).equals(
//                s.substring(s.lastIndexOf(" ") + 1)));
//        System.out.println("New List of Names that is removed first and last: \n" + Arrays.toString(names));

        newList.removeIf(s -> {
            String first = s.substring(0, s.indexOf(' '));
            String last = s.substring(s.lastIndexOf(' ') + 1);

            System.out.println("First:  " + first + "   Last: " + last);

            return first.equals(last);
        });

        System.out.println("New List of Names that is removed first and last: \n" + Arrays.toString(names));

    }

    public static char getRandomChar(char start, char end){
        int lowerBound = random.nextInt((int) start);
        int upperbound = random.nextInt((int) end);

        System.out.println("Get Random Character:.....  ");
        System.out.println("Lower bound =  " + lowerBound + "   Character = " + (char)lowerBound);
        System.out.println("Upper bound =  " + upperbound + "   Character = " + (char)upperbound);
        System.out.println("Selected character  =  " + (char)random.nextInt((int) start, (int) end + 1));
        return (char) random.nextInt(start, (int) end + 1);
    }

    public static String getReversed(String str){
        StringBuilder result = new StringBuilder(str);
        result.reverse();
        System.out.println("Result of getReversed:  " + result);
        return result.toString();
    }
}
