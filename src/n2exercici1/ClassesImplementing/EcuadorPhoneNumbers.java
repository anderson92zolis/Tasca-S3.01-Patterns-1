package n2exercici1.ClassesImplementing;

import n2exercici1.Interfaces.PhoneNumber;

import java.util.HashMap;

public class EcuadorPhoneNumbers implements PhoneNumber {

    public static HashMap<String, String> listsPhoneNumbersEcuador = new HashMap<>();
    private static final String dialingCode = "+593";

    public EcuadorPhoneNumbers() {

    }

    public void addPhoneNumber(String user, String PhoneNumber) {
        listsPhoneNumbersEcuador.put(user, PhoneNumber + "->" + dialingCode);
    }

    public void findPhoneNumber(String user) {
        System.out.println(user + " with address " + listsPhoneNumbersEcuador.get(user));
    }

    public void deletePhoneNumber(String user) {
        System.out.println(listsPhoneNumbersEcuador.remove(user));

    }
}
