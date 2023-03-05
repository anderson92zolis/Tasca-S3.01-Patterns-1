package n2exercici1.ClassesImplementing;

import n2exercici1.Interfaces.PhoneNumber;

import java.util.HashMap;

public class ThailandPhoneNumbers implements PhoneNumber {

    public static HashMap<String, String> listsPhoneNumbersThailand = new HashMap<>();
    private static final String dialingCode = "+66";

    public ThailandPhoneNumbers() {

    }

    public void addPhoneNumber(String user, String PhoneNumber) {
        listsPhoneNumbersThailand.put(user, PhoneNumber + "->" + dialingCode);
    }

    public void findPhoneNumber(String user) {
        System.out.println(user + " with address " + listsPhoneNumbersThailand.get(user));
    }

    public void deletePhoneNumber(String user) {
        System.out.println(listsPhoneNumbersThailand.remove(user));

    }
}
