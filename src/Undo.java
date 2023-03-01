public class Undo {
    private static final Undo instance;

    // //Private constructor to prevent instantiation of the class from other classes.
    private Undo(){
        if (instance == null){
            instance= new Undo();
        }
        return instance;

    }
