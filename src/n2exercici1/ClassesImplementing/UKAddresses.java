package n2exercici1.ClassesImplementing;

import java.util.HashMap;
import n2exercici1.Interfaces.Address;

public class UKAddresses implements Address{
    public static HashMap<String,String> listsAdressesUk= new HashMap<>();
    private static final String country ="United Kingdom";

    public UKAddresses(){

    }

    public void addAddress(String user, String address){
        listsAdressesUk.put(user,address + "->" + country);
    }
    public void findAddress(String user){
        System.out.println(user + " with address " +listsAdressesUk.get(user) );
    }
    public void deleteAddress(String user){
        System.out.println(listsAdressesUk.remove(user));
    }

}
