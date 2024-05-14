import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    // write code here
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;
        long avg = 0;

        while(true){
            if(!scanner.hasNextInt())
                break;

            sum += scanner.nextInt();
            count++;

            scanner.nextLine();
        }

        if(count > 0)
            avg = Math.round((double) sum / count);


        System.out.println("SUM = " + sum +" AVG = " + avg);
        scanner.close();
    }
}
