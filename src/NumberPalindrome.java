public class NumberPalindrome {
    public static void main(String[] args) {
        int n = -12321;

        System.out.println("Is " + n + " palindrome?  " + isPalindrome(n));
    }
    // write code here
    public static boolean isPalindrome(int number){
        int reversedNumber = 0;
        int originalNumber = number;

        while(number != 0){
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }

        return (reversedNumber == originalNumber);
    }

}
