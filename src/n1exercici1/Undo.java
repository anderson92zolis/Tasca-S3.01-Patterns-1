import java.util.ArrayList;

public class Undo {
    private static Undo instance;
    private ArrayList<String> listCommants;

    // //Private constructor to prevent instantiation of the class from other classes.


    private Undo() {
        listCommants = new ArrayList<String>();
        ;
    }

    // getter
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    // setter

    public void addCommad(String commandInsert) {
        listCommants.add(commandInsert);
    }

    public void removeCommand(String commandRemove ) {
        listCommants.removeIf(nombre -> nombre.equalsIgnoreCase(commandRemove));  // equals
    }

    public void listCommads(){
        listCommants.forEach(n-> System.out.println(n));
    }

}


