package n1exercici1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Undo undo = Undo.getInstance();

        boolean sortir = false;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        do {
            switch (menu()) {
                case 1:
                    System.out.println("Insert command to add: ");
                    String commandInsert = myObj.nextLine();
                    undo.addCommad(commandInsert) ;
                    break;
                case 2:
                    System.out.println("Insert command to delete");
                    String deleteCommand = myObj.nextLine();
                    undo.removeCommand(deleteCommand);
                    break;
                case 3:
                    undo.listCommads();
                    break;
                case 0:
                    System.out.println("Thanks you for using the application ");
                    sortir = true;
                    break;
                default:
                    System.out.println("Option not recognized, try again");
            }
        } while (!sortir);
    }


    public static byte menu() {
        Scanner entrada = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Add Command.");
            System.out.println("2. Delete Command.");
            System.out.println("3. List all the commands saved.");
            System.out.println("0. Exists de app.\n");
            opcio = entrada.nextByte();
            if (opcio < MINIMO || opcio > MAXIMO) {
                System.out.println("Option not valid try again");
            }
        } while (opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
}