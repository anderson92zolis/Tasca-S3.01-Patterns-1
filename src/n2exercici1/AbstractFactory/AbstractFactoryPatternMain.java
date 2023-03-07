package n2exercici1.AbstractFactory;

import java.util.Scanner;

public class AbstractFactoryPatternMain {

    public static void main(String[] args) {

        String user = "";
        String country = "";
        String address = "";
        String phoneNumber = "";

        Scanner myObj= new Scanner(System.in);

        int addressOrPhoneNumber;
        boolean sortir;

        do{

            System.out.println("1. Option 1. To manage the ADDRESSES");
            System.out.println("2. Option 2. To manage the PHONE NUMBERS");
            System.out.println("0. Exit the Application.\n");

            addressOrPhoneNumber = myObj.nextInt();

            sortir = false;

            switch(addressOrPhoneNumber){
                case 1:
                    System.out.println("This is the part of ADDRESS! ");

                    switch(menu()){
                        case 1:
                            myObj.nextLine();
                            System.out.println("Enter the name of the country (Ecuador or Thailand):");
                            country = myObj.nextLine();
                            System.out.println("Enter your user name:");
                            user = myObj.nextLine();
                            System.out.println("Enter the address:");
                            address = myObj.nextLine();
                            Manager.addingAddressMenu(user, country, address);
                            break;
                        case 2:
                            myObj.nextLine();
                            System.out.println("Enter the name of the country (Ecuador or Thailand):");
                            country = myObj.nextLine();
                            System.out.println("Enter your user name:");
                            user = myObj.nextLine();
                            Manager.findAddressMenu(user, country);
                            break;
                        case 3:
                            myObj.nextLine();
                            System.out.println("Enter the name of the country (Ecuador or Thailand):");
                            country = myObj.nextLine();
                            System.out.println("Enter your user name:");
                            user = myObj.nextLine();
                            Manager.deleteAddressMenu(user, country);
                            break;
                        case 0: System.out.println("Thanks for use the App");
                            sortir = true;
                            break;
                    }

                    break;
                case 2:
                    System.out.println("This is the part of PhoneNumber! ");

                        switch(menu()){

                            case 1:
                                myObj.nextLine();
                                System.out.println("Enter the name of the country (Ecuador or Thailand):");
                                country = myObj.nextLine();
                                System.out.println("Enter your user name:");
                                user = myObj.nextLine();
                                System.out.println("Enter the PhoneNumber:");
                                phoneNumber = myObj.nextLine();
                                Manager.addingPhoneNumberMenu(user, country ,phoneNumber);
                                break;
                            case 2:
                                myObj.nextLine();
                                System.out.println("Enter the name of the country (Ecuador or Thailand):");
                                country = myObj.nextLine();
                                System.out.println("Enter your user name:");
                                user = myObj.nextLine();
                                Manager.findPhoneNumberMenu(user, country);
                                break;
                            case 3:
                                myObj.nextLine();
                                System.out.println("Enter the name of the country (Ecuador or Thailand):");
                                country = myObj.nextLine();
                                System.out.println("Enter your user name:");
                                user = myObj.nextLine();
                                Manager.deletePhoneNumberMenu(user, country);
                                break;
                            case 0: System.out.println("Thanks for use the App");
                                sortir = true;
                                break;
                        }

                    break;
                case 0: System.out.println("Thanks for use the App");
                    sortir = true;
                    break;
            }
        }while(!sortir);

    }

    public static byte menu(){
        Scanner entrada = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do{
            System.out.println("Choose a option: ");
            System.out.println("\r 1. Option 1. Add");
            System.out.println("\r 2. Option 2. Find");
            System.out.println("\r 3. Option 3. Delete");
            System.out.println("\r 0. Exit the Application.\n");
            opcio = entrada.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Number must be between 1-3");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
}
