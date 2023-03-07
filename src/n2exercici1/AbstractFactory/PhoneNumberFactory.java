package n2exercici1.AbstractFactory;

import n2exercici1.ClassesImplementing.*;
import n2exercici1.Interfaces.Address;
import n2exercici1.Interfaces.PhoneNumber;
import n2exercici1.Interfaces.Agenda;

public class PhoneNumberFactory implements Agenda {

    public PhoneNumber getPhoneNumber(String country){

        if (country.equalsIgnoreCase("Ecuador")){
            return new EcuadorPhoneNumbers();
        }
        else if(country.equalsIgnoreCase("Thailand")){
            return new ThailandPhoneNumbers();
        }
        else {
            return null;
        }

    }

    public Address getAddress(String country){
        return null;
    }
}
