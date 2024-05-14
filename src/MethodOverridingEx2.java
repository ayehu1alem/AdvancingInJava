public class MethodOverridingEx2 {
    public static void main(String[] args) {
        String result = getDurationString(38784);
        System.out.println("Output:  " + result);
    }

    public static String getDurationString(int seconds){
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = minutes / 60;

        int remainingSeconds = seconds % 60;
        int remainingMinutes = minutes % 60;

        return hours + "hrs   " + remainingMinutes + "m   " + remainingSeconds + "s";
    }
}
