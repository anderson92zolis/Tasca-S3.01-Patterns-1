package n2exercici1.AbstractFactory;

import n2exercici1.ClassesImplementing.EcuadorAddresses;
import n2exercici1.ClassesImplementing.ThailandAddresses;
import n2exercici1.Interfaces.Address;
import n2exercici1.Interfaces.Agenda;
import n2exercici1.Interfaces.PhoneNumber;

public class AddressFactory implements Agenda {

    public Address getAddress(String country){

        if (country.equalsIgnoreCase("Ecuador")){
            return new EcuadorAddresses();
        }
        else if(country.equalsIgnoreCase("Thailand")){
            return new ThailandAddresses();
        }
        else {
            return null;
        }
    }

    public PhoneNumber getPhoneNumber(String country){
        return null;
    }

}
