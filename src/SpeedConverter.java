public class SpeedConverter {
    // write code here
    public static void main(String[] args) {
        double km = 1.5;
        System.out.println("Result:  " + toMilesPerHour(75.114));
    }

    public static long toMilesPerHour(double  kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1L;
        }

        return Math.round (kilometersPerHour / 1.61);
    }
}
