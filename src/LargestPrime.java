public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (217));
    }

    public static int getLargestPrime(int number){
        if(number < 2) return -1;
        int div = 2;
        int largestPrimeFactor = number;

        while (div < largestPrimeFactor){
            if(largestPrimeFactor % div != 0)
                div++;
            else {
                largestPrimeFactor /= div;
                div = 2;
            }
        }

        return largestPrimeFactor;
    }
}
