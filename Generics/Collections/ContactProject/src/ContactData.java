import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {

    private static String emailData = """
            Alemayehu Haddis, aaaa@gmail.com
            Samuel Almaw, sssss@gmail.com           
            Tadesse Worede, ttttt@gmail.com
            Yohannis Kuru, yyyyyy@gmail.com 
            """;


    private static String phoneData = """
            Alemayehu Haddis, +251 976646477
            Samuel Almaw, +251 9135656552
            Tadesse Worede, +251 913565653
            Yohannis Kuru, +251 913565654
             """;


    public static List<Contact> getData(String type){
        List<Contact> dataList = new ArrayList<>();
        Scanner scanner = new Scanner(type.equals("phone")? phoneData: emailData);

        while(scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);

            if(type.equals("phone")){
                dataList.add(new Contact(data[0], data[1]));
            }
            else if(type.equals("email")){
                dataList.add(new Contact(data[0], data[1]));
            }
        }

        return dataList;
    }
}
