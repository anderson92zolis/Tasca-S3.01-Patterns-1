package n2exercici1.ClassesImplementing;

import java.util.HashMap;
import n2exercici1.Interfaces.PhoneNumber;

public class UKPhoneNumbers implements PhoneNumber {

    public static HashMap<String, String> listsPhoneNumbersUK = new HashMap<>();
    private static final String dialingCode = "+44";

    public UKPhoneNumbers() {

    }

    public void addPhoneNumber(String user, String PhoneNumber) {
        listsPhoneNumbersUK.put(user, PhoneNumber + "->" + dialingCode);
    }

    public void findPhoneNumber(String user) {
        System.out.println(user + " with address " + listsPhoneNumbersUK.get(user));
    }

    public void deletePhoneNumber(String user) {
        System.out.println(listsPhoneNumbersUK.remove(user));

    }
}
