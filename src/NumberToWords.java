public class NumberToWords {
    public static void main(String[] args) {
        int number = 10589;
        numberToWords(number);
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int lastZeroes = getDigitCount(number) - getDigitCount(reversedNumber);

        if (number == 0) {
            System.out.print(" Zero");
            return;
        }

        while (reversedNumber != 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0 -> System.out.print(" Zero");
                case 1 -> System.out.print(" One");
                case 2 -> System.out.print(" Two");
                case 3 -> System.out.print(" Three");
                case 4 -> System.out.print(" Four");
                case 5 -> System.out.print(" Five");
                case 6 -> System.out.print(" Six");
                case 7 -> System.out.print(" Seven");
                case 8 -> System.out.print(" Eight");
                case 9 -> System.out.print(" Nine");
            }

            reversedNumber /= 10;
        }

        for (int i = 0; i < lastZeroes; i++){
            System.out.print(" Zero");
        }
    }

    public static int reverse(int number){
        int rev = 0;
        while(number != 0){
            rev = (rev * 10) + (number % 10);
            number /= 10;
        }

        return rev;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= number; i *= 10){
            count++;
        }

        return count;
    }
}