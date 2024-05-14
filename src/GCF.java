public class GCF {
    public static void main(String[] args) {
        System.out.println("The greatest common factor is:  " + getGreatestCommonDivisor(13, 47));
        System.out.println("The greatest common factor is:  " + getGreatestCommonDivisor(12, 30));
        System.out.println("The greatest common factor is:  " + getGreatestCommonDivisor(9, 18));
        System.out.println("The greatest common factor is:  " + getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) return -1;

        //The smallest number may or maynot be the factor of the greater one
        int smallestNumber = (first < second) ? first : second;

        int commonFactor = 0;
        int greatestCommonFactor = 0;

        int i = 1;
        while(i <= smallestNumber){
            if((first % i == 0) && (second % i == 0))
                commonFactor = i;

            if(commonFactor > greatestCommonFactor)
                greatestCommonFactor = commonFactor;

            i++;
        }

        return greatestCommonFactor;
    }
}
