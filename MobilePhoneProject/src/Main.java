public class Main {
    public static void main(String[] args) {

        Contact contact1 = Contact.createContact("Tim", "555-555-5555");
        Contact contact2 = Contact.createContact("Alemayehu", "251976646477");
        Contact contact3 = Contact.createContact("Tadu", "555-555-5555");

        MobilePhone mobilePhone = new MobilePhone("555-555-5555");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);

        mobilePhone.printContacts();
        System.out.println(mobilePhone.queryContact("Alemayehu").getPhoneNumber());
    }
}
