package n2exercici1.AbstractFactory;

import n2exercici1.Interfaces.Address;
import n2exercici1.Interfaces.Agenda;
import n2exercici1.Interfaces.PhoneNumber;

public class Manager {

    // address
    public static void addingAddressMenu(String user, String country, String address){
        Agenda firstFactory = TypeFactoryAgenda.getFactory("address");
        if (country.equalsIgnoreCase("Ecuador")) {
            Address addressFact = firstFactory.getAddress("Ecuador");
            addressFact.addAddress(user,address);
        }
        else if (country.equalsIgnoreCase("Thailand")) {
            Address addressFact = firstFactory.getAddress("Thailand");
            addressFact.addAddress(user,address);
        } else {
            System.out.println("you must enter a valid COUNTRY");
        }
    }
    public static void findAddressMenu(String user, String country){
        Agenda firstFactory= TypeFactoryAgenda.getFactory("address");
        if (country.equalsIgnoreCase("Ecuador")){
            Address addressFact = firstFactory.getAddress("Ecuador");
            addressFact.findAddress(user);
        }
        else if (country.equalsIgnoreCase("Thailand")) {
            Address addressFact = firstFactory.getAddress("Thailand");
            addressFact.findAddress(user);
        } else {
            System.out.println("you must enter a valid COUNTRY");}

    }
    public static void deleteAddressMenu(String user, String country){
        Agenda firstFactory= TypeFactoryAgenda.getFactory("address");
        if (country.equalsIgnoreCase("Ecuador")){
            Address addressFact= firstFactory.getAddress("Ecuador");
            addressFact.deleteAddress(user);
        }
        else if (country.equalsIgnoreCase("Thailand")) {
            Address addressFact = firstFactory.getAddress("Thailand");
            addressFact.deleteAddress(user);
        } else {
            System.out.println("you must enter a valid COUNTRY");
        }
    }


    // PhoneNumber
    public static void addingPhoneNumberMenu(String user, String country, String phoneNumber){
        Agenda firstFactory = TypeFactoryAgenda.getFactory("PhoneNumber");
        if (country.equalsIgnoreCase("Ecuador")) {
            PhoneNumber phoneNumberFact = firstFactory.getPhoneNumber("Ecuador");
            phoneNumberFact.addPhoneNumber(user,phoneNumber);
        }
        else if (country.equalsIgnoreCase("Thailand")) {
            PhoneNumber phoneNumberFact = firstFactory.getPhoneNumber("Thailand");
            phoneNumberFact.addPhoneNumber(user,phoneNumber);
        } else {
            System.out.println("you must enter a valid COUNTRY");
        }
    }
    public static void findPhoneNumberMenu(String user, String country){
        Agenda firstFactory= TypeFactoryAgenda.getFactory("PhoneNumber");
        if (country.equalsIgnoreCase("Ecuador")){
            PhoneNumber phoneNumberFact = firstFactory.getPhoneNumber("Ecuador");
            phoneNumberFact.findPhoneNumber(user);
        }
        else if (country.equalsIgnoreCase("Thailand")) {
            PhoneNumber phoneNumberFact = firstFactory.getPhoneNumber("Thailand");
            phoneNumberFact.findPhoneNumber(user);
        } else {
            System.out.println("you must enter a valid COUNTRY");}

    }
    public static void deletePhoneNumberMenu(String user, String country) {
        Agenda firstFactory = TypeFactoryAgenda.getFactory("PhoneNumber");
        if (country.equalsIgnoreCase("Ecuador")) {
            PhoneNumber phoneNumberFact = firstFactory.getPhoneNumber("Ecuador");
            phoneNumberFact.deletePhoneNumber(user);
        } else if (country.equalsIgnoreCase("Thailand")) {
            PhoneNumber phoneNumberFact = firstFactory.getPhoneNumber("Thailand");
            phoneNumberFact.deletePhoneNumber(user);
        } else {
            System.out.println("you must enter a valid COUNTRY");
        }
    }
}
