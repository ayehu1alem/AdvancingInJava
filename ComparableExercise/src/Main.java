import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 9, -4, 8};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d:   Compare to = %d%n",
                    five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }
        System.out.println();

        String banana = "banana";
        String[] fruits = {"apple", "banana", "peer", "BANANA"};

        for (String s : fruits) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s:   Compare to = %d%n",
                    banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println();
        System.out.println("A: " + (int) 'A' + "  " + "a: " + (int) 'a');
        System.out.println("B: " + (int) 'b' + "  " + "b: " + (int) 'b');
        System.out.println("C: " + (int) 'C' + "  " + "c: " + (int) 'c');
        System.out.println("P: " + (int) 'P' + "  " + "p: " + (int) 'p');
        System.out.println();

        Student tim = new Student("Tim");
        Student[] students = {
                new Student("Tim"),
                new Student("Sale"),
                new Student("Alex"),
                new Student("Anna")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        for (var s : students) {
            int val = s.compareTo(tim);
            System.out.printf("%s %s %s:   Compare to = %d%n",
                    tim, (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }

        System.out.println("Result = " + tim.compareTo(new Student("Merry")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return (o1.name + o1.gpa).compareTo(o2.name + o2.gpa);
    }
}

class Student implements Comparable<Student> {

    private static int lastID = 1000;
    private static Random random = new Random();

    String name;
    private int id;
    protected double gpa;


    public Student(String name){
        this.name = name;
        id = lastID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    public String toString(){
        return "ID: %d - %s (%.2f) %n".formatted(id, name, gpa);
    }


    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
