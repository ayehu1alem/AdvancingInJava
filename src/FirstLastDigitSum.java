public class FirstLastDigitSum {
    public static void main(String[] args) {
        int n = 92564;

        System.out.println("The sum of the first and last digits is:  " + sumFirstAndLastDigit(n));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) return -1;

        int lastDigit = number % 10;
        int firstDigit = 0;
        while(number > 0){
            firstDigit = (number % 10);
            number /= 10;
        }

        return (firstDigit + lastDigit);
    }
}
