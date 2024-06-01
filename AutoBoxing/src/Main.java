import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        Integer boxedInt = Integer.valueOf(15);                //prefered but unnecessary
       // Integer deprecatedBoxing = new Integer(15);          //Deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();                       //Unnecessary

        Integer autoBoxed = 15;
        Float autoBoxed2 = 0.15F;
        String autoBoxed3 = "15";
        Long autoBoxed4 = 15L;
        Boolean autoBoxed5 = true;
        int autoUnboxed = autoBoxed;


        Double resultBoxed = getDoubleobject();
        double resultUnboxed = getLiteralDoublePrimitive();

        System.out.println(autoBoxed + "      " + autoBoxed.getClass().getName());
        System.out.println(autoBoxed2 + "      " + autoBoxed2.getClass().getName());
        System.out.println(autoBoxed3 + "      " + autoBoxed3.getClass().getName());
        System.out.println(autoBoxed4 + "      " + autoBoxed4.getClass().getName());
        System.out.println(autoBoxed5 + "      " + autoBoxed5.getClass().getName());
        System.out.println(resultBoxed + "      " + resultBoxed.getClass().getSimpleName());

        //System.out.println(resultUnboxed + " " + resultUnboxed.getClass().getSimpleName());
        var ourList = getList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(ourList);



    }
    private static Integer getIntegerObject(int i){
        return i;
    }
    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }
        return aList;
    }

    private static Double getDoubleobject(){
        return Double.valueOf(100.00);
    }
    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
