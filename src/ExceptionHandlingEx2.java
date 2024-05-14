import java.util.Scanner;

public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        MinAndMax();
    }

    public static void MinAndMax(){
        System.out.println("Enter a number to get min, max and sum or  or any character to exit!");
        Scanner scanner = new Scanner(System.in);

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;

        int count = 1;

        while(true){
            System.out.println("Enter number #" + count);
            String nextNumber = scanner.nextLine();

            try {
                double number = Double.parseDouble(nextNumber);
                if (number < min)
                    min = number;
                else if (number > max)
                    max = number;


                sum += number;
            } catch(NumberFormatException nfe){
                //Here, Continue can be used to skip char input. But, we need to exit loop.
                //To exit the loop, we need a break statement. For example, while(count <=5)
                break;
            }


            count++;
        }

        if(count > 1){
            System.out.println("MIN = " + min + "  MAX= " + max + " ... SUM = " + sum);
        }else{
            System.out.println("No Valid data entered");
        }

    }
}
