
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();


        Employee john = new Employee("John Doe",30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee alemayehu = new Employee("Alemayehu H", 38);
        Employee mekonnen = new Employee("Mekonnen B", 30);

       // System.out.println(john);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(alemayehu);
        employees.add(mekonnen);

        employees.forEach(System.out::print);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                //return employee1.getAge() - employee2.getAge();     // To Sort from younger to older
                return employee2.getAge() - employee1.getAge();        //To Sort from older to younger
            }
        });
        System.out.println("\nSorting by age:  " + employees);


        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                //return employee1.getName().compareTo(employee2.getName());            // To Sort alphabetically
                return employee2.getName().compareTo(employee1.getName());              // To Sort reverse alphabetically
            }
        });

        System.out.println("\nSorting by name:  " + employees);

        System.out.println("\nLambda Expressions: ");
        Collections.sort(employees, (a, b) ->
                a.getName().compareTo(b.getName()));
        employees.forEach(System.out::print);



        System.out.println("\n\n=====   LAMBDA EXPRESSION on Methods    ==========");
        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        },
        employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() +  s2.toUpperCase();
        String sillyString2 = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString2);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}



class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nName= '" + name + "', age=" + age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}
