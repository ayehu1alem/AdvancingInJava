import java.util.Scanner;

public class ExceptionHandlingEx1 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        while(count <= 5){
            System.out.println("Enter number #" + count + ": ");
            String nextNumber = scanner.nextLine();

            try{
                sum += Double.parseDouble(nextNumber);
                count++;
            }catch(NumberFormatException nfe){
                System.out.println("Invalid Input");
            }
        }

       System.out.println("SUM = " + sum);
    }
}
