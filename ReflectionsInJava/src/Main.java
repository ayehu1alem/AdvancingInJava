import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

//        Animal animal2 = new Animal();
//        animal2.makeNoise();
//
//        Animal animal1 = new Animal(){
//            @Override
//            public void makeNoise() {
//                System.out.println("Meow");
//            }
//        };
//        animal1.makeNoise();
//
//        Runnable runnable = new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("I am a Runnable");
//            }
//        };
//        runnable.run();



        Cat cat = new Cat("Stella", 6);

        System.out.println(cat.getName());
        Field[] catField = cat.getClass().getDeclaredFields();

        System.out.println(Arrays.toString(catField));

        for (Field field : catField) {
            System.out.println(field);
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(cat, "Cathy");
            }
        }
        System.out.println("Java reflection changed final field to :   " + cat.getName());
        System.out.println("================================");
        System.out.println();
//
        Method[] catMethods = cat.getClass().getDeclaredMethods();

        for(Method method : catMethods){
           // System.out.println(method);
            if(method.getName().equals("snores")){
               // method.setAccessible(false);
                method.invoke(cat);
            }

            if(method.getName().equals("privateMethod")){
                method.setAccessible(true);
                method.invoke(cat);
            }

            if(method.getName().equals("protectedMethod")){
                method.setAccessible(true);
                method.invoke(cat);
            }

            if(method.getName().equals("privateStaticMethod")){
                method.setAccessible(true);
                System.out.println("Private Static Method: " + method.getName());
                method.invoke(cat);
            }

        }

    }
}
