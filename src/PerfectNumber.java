public class PerfectNumber {

    public static void main(String[] args) {
        //System.out.println(" Checked perfect number: " + isPerfect(6));
        //System.out.println(" Checked perfect number: " + isPerfect(28));
        System.out.println(" Checked perfect number: " + isPerfect2(496));
       // System.out.println(" Checked perfect number: " + isPerfect(8128));
    }
    public static boolean isPerfect(int number) {
        if(number < 1) return false;

        int i = 1, sum = 0;

        while(i < number){
            if(number % i == 0){
                sum += i;
            }
            i++;
        }
        return sum == number;
    }
    public static boolean isPerfect2(int number) {
        if(number < 1) return false;
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
