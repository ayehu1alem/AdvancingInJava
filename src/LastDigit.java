public class LastDigit {
    public static void main(String[] args) {
        System.out.println(" Is the last digit the same:  " + hasSameLastDigit( 413, 23, 7));
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {

        // Check if any number is out of range and return false if so
        //This is my favorite way of doing which is partition similar cases separately and then combine from another method
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        // Extract last digits
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        // Check if any two digits are the same
        return (lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC);
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000); // Inclusive range check
    }
}
