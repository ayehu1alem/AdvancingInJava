public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) return false;

        if(hourOfDay >= 8 && hourOfDay < 22)
            return !barking;

        return barking;
    }


    public static void main(String[] args) {
        boolean isRight = shouldWakeUp (false, 2);

        System.out.println("Result:  " + isRight);
    }
}
