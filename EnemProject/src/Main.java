import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int random = new Random().nextInt(7);
        DaysOfAWeek weekDay = DaysOfAWeek.TUES;

        for(int i = 0; i < 20; i++){
            weekDay = getRandomDay();
            printDays(weekDay);

        }
    }

    private static void printDays(DaysOfAWeek day) {
        int weekDayInt = day.ordinal() + 1;
        switch (day) {
            case MON -> System.out.println("Monday is       " + weekDayInt + "st day of the week.");
            case TUES -> System.out.println("Tuesday is     " + weekDayInt + "nd day of the week.");
            case WEDNES -> System.out.println("Wednesday is      " + weekDayInt + "rd day of the week.");
            default -> System.out.println(String.format(day.name().charAt(0)
                    + day.name().substring(1).toLowerCase() + "day is       "
                    + weekDayInt + "th day of the week."));

        }
    }

    private static DaysOfAWeek getRandomDay() {
        int random = new Random().nextInt(7);
        var allDays = DaysOfAWeek.values();

        return allDays[random];
    }
}