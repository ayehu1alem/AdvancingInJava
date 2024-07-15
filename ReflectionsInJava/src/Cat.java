public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void makeNoise(){
        System.out.println("Meeeeeeeeeeeeeee awu");
    }

    public void snores(){
        System.out.println("Kurrrrrrrrrrr");
    }

    private void privateMethod(){
        System.out.println("I am from privateMethod");
    }

    protected void protectedMethod(){
        System.out.println("I am from protectedMethod");
    }

    private static void privateStaticMethod(){
        System.out.println("I am from privateStaticMethod");
    }


}
