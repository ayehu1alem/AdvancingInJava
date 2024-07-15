public class Main {
    public static void main(String[] args) {
        //sum3And5Dividers();
//        printFirst10EvenNumbers();
        System.out.println("While loop: " + sumDigits(98523));
        System.out.println("For loop: " + sumDigitsFor_Loop(98523));
        System.out.println("Do-While loop: " + sumDigitsDo_While_Loop(98523));
        System.out.println("Converted to String: " + sumDigitsString(98523));

//        int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println();
//
//        count = 6;
//        do{
//            System.out.println("1. Do Count = " + count);
//            count++;
//
//            if(count > 10){
//                //System.out.println("2. Do Count = " + count);
//                break;
//            }
//
//        }while(true);
//        do{
//            System.out.println("Do Count value is " + count);
//            count++;
//
//            if(count > 50) break;
//        } while(count != 6);
//        for(int i=1; i<7; i++){
//            System.out.println("Count value is " + count);
//        }

//        for(count=1; count!=6; count++){
//            System.out.println("Count value is " + count);
//        }

//        count = 1;
//        while(true){
//            System.out.println("1. Count value is " + count);
//            if(count == 5){
//                System.out.println("2. Count = " + count);
//                break;
//            }
//            System.out.println("3. Count value is " + count + "\n");
//            count++;
//        }
    }


    //A Method that sums up 6 factors of 3 and 5
    private static void sum3And5Dividers(){
        int sum = 0;
        int count = 0;
        for(int i=1; i<=1000; i++){
            if(i%3==0 && i%5==0){
                System.out.println("Number = " + i);
                sum += i;
                count++;
            }

            if(count == 6)
                break;
        }

        System.out.println("Sum = " + sum);
    }

    //Create a mothod called isEvennumber that takes a parameter type int
    //Its purpose is to determin if a the argument passed to the method is
    //an even number or not.
    //return true if the number is even number, otherwise return false

    private static void printFirst10EvenNumbers(){
        int count = 0;
        for(int i=1; true; i++) {
            if (isEvenNumber(i)) {
                System.out.println("Even number =  " + i);
                count++;
            }

            if(count == 5) break;
        }
        System.out.println("1. Total Even number found are " + count);
        System.out.println();

        int start = 4;
        count = 0;
        for(; true;) {
            start++;
            if (isEvenNumber(start)) {
                System.out.println("Even number =  " + start);
                count++;
            }

            if(count == 5) break;
        }
        System.out.println("2. Total Even number found are " + count);
        System.out.println();

        int end = 20;
        count = 0;
        for(int left = 4; left<=end; left++) {
            if(!isEvenNumber(left)){
                continue;
            }
            System.out.println("Even number =  " + left);
            count++;

            if(count == 5) break;
        }
        System.out.println("3. Total Even numbers are " + count);
        System.out.println();

        start = 4;
        count = 0;
        while(start <= end){
            start++;
            if(!isEvenNumber(start)){
                continue;
            }
            System.out.println("Even number =  " + start);
            count++;

            if(count >= 5) break;
        }
        System.out.println("4. Total Even number found are " + count);
    }

    private static boolean isEvenNumber(int number){
        return number%2 == 0;
    }

    private static int sumDigits(int n){
        if(n < 0) return -1;

        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    private static int sumDigitsFor_Loop(int n){
        if(n < 0) return -1;

        int sum = 0;
        for(int i=n; i>0; i--){
            sum +=  n%10;
            n /= 10;

            if(n == 0) break;
        }

        return sum;
    }

    private static int sumDigitsDo_While_Loop(int n){
        if(n < 0) return -1;
        int sum = 0;
        do{
            sum +=  n%10;
            n /= 10;
        }while(n != 0);

        return sum;
    }

    private static int sumDigitsString(int n){
        if(n < 0) return -1;

        int sum = 0;
        String copy = String.valueOf(n);
        int i = 0;
        while(i < copy.length()){
            sum += Integer.parseInt(String.valueOf(copy.charAt(i)));
            i++;
        }

        return sum;
    }
}
