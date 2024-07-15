import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");

        printData("Phone List", phones);
        printData("Emails List", emails);

        Set<Contact> emailSet = new HashSet<>(emails);
        Set<Contact> phoneSet = new HashSet<>(phones);

        printData("Emails Set", emailSet);
        printData("Phones Set", phoneSet);






    }
    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("----------------------------------");
        System.out.println(header);
        System.out.println("==================================");
        contacts.forEach(System.out::println);
    }
}
