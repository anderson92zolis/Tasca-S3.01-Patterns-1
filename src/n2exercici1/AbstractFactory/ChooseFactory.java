package n2exercici1.AbstractFactory;

import n2exercici1.Interfaces.Agenda;

public class ChooseFactory {

    public static Agenda getFactory(String typeFactory){
        if (typeFactory.equalsIgnoreCase("address")){
            return new AddressFactory();
        }
        else if (typeFactory.equalsIgnoreCase("PhoneNumber")){
            return new PhoneNumberFactory();
        }
        else {return null;}
    }
}
