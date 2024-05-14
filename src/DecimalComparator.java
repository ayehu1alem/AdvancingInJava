public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){

        int n = (int) (first * 1000);
        int m = (int) (second * 1000);

        return n == m;
    }

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.123, 3.123);
        System.out.println(result);
    }
}
