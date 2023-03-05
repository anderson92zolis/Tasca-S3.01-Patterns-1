package n2exercici1.ClassesImplementing;

import n2exercici1.Interfaces.Address;

import java.util.HashMap;

public class EcuadorAddresses implements Address {

    public static HashMap<String,String> listsAdressesEcuador= new HashMap<>();
    private static final String country ="Ecuador";

    public EcuadorAddresses(){

    }

    public void addAddress(String user, String address){
        listsAdressesEcuador.put(user,address + "->" + country);
    }
    public void findAddress(String user){
        System.out.println(user + " with address " +listsAdressesEcuador.get(user) );
    }
    public void deleteAddress(String user){
        System.out.println(listsAdressesEcuador.remove(user));
    }

}
