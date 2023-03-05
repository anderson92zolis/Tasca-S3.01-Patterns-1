package n2exercici1.ClassesImplementing;

import n2exercici1.Interfaces.Address;

import java.util.HashMap;

public class ThailandAddresses implements Address{

    public static HashMap<String,String> listsAddressesThailand= new HashMap<>();
    private static final String country ="Thailand";

    public ThailandAddresses(){
    }

    public void addAddress(String user, String address){
        listsAddressesThailand.put(user,address + "->" + country);
    }
    public void findAddress(String user){
        System.out.println(user + " with address " +listsAddressesThailand.get(user) );
    }
    public void deleteAddress(String user){
        System.out.println(listsAddressesThailand.remove(user));
    }
}
