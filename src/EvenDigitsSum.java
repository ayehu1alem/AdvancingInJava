public class EvenDigitsSum {
    public static void main(String[] args) {
        int n = 61235;
        System.out.println("Even digits sum  =  " + getEvenDigitSum(n));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;

        int sumEvenNumbers = 0;

        while(number > 0){
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sumEvenNumbers += lastDigit;
            }

            number /= 10;
        }

        return sumEvenNumbers;
    }
}
