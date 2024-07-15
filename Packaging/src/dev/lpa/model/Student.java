package dev.lpa.model;

import java.util.Random;

public class Student {
    private String name;
    private String course;
    private int yearStarted;
    private int id;

    protected int firstID = 10_000;
    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "python"};

    public Student(){
        int lastnameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastnameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
        id = getID();
    }

    public int getYearStarted() {
        return yearStarted;
    }
    public int getID(){
        return this.firstID + 1;
    }

    @Override
    public String toString() {
        return "%d   %-15s %-15s %d".formatted(id, name, course, yearStarted);
    }
}
