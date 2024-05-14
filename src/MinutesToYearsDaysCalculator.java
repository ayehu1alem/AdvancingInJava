public class MinutesToYearsDaysCalculator {
    private static final int MIN_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int DAYS_PER_YEAR = 365;

    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;

    public static void printYearsAndDay(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }

        long years = minutes / MIN_PER_YEAR;
        int remainingDays = (int) (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;

        System.out.printf("%d min = %d y and %d d", minutes, years, remainingDays);
    }

    public static void main(String[] args) {
        long min = 561600;
        printYearsAndDay(min);
    }
}
