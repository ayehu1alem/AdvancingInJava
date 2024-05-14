public class MethodOverridingEx {
    public static void main(String[] args) {
        int feet = 5;
        int inches = 7;
        double result = convertToCentimeters(feet, inches);

        System.out.println("Result:  " + result);

    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return (feet * 30.48) + convertToCentimeters(inches);
    }
}
