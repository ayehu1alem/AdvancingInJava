import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> email = new HashSet<>();
    private Set<String> phone = new HashSet<>();

    public Contact(String name){
        this(name, null);
    }

    public Contact(String name, String email){
        this(name, email, 0);
    }

    public Contact(String name, String email, long phone){
        this.name = name;
        if(email != null)
            this.email.add(email);

        if(phone > 0) {
            String p = String.valueOf(phone);
            p = "(%s) %s %s".formatted(p.substring(0, 3), p.substring(3,6), p.substring(6));
            this.phone.add(p);
        }
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "%s:-  %s %s".formatted(name, email, phone);
    }


    public Contact mergeContactData(Contact contact){
        Contact newContact = new Contact(name);
        newContact.email = new HashSet<>(this.email);
        newContact.phone = new HashSet<>(this.phone);

        newContact.email.addAll(contact.email);
        newContact.phone.addAll(contact.phone);


        return newContact;
    }

}
