package n3exercici1.extend;

import java.io.PrintStream;

public abstract class vehicule {
    private int speed;

    public vehicule(int speed) {
        this.speed = speed;
    }

    // getter
    public int getSpeed() {
        return speed;
    }

    //setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // create the methodes


    abstract void start();
    abstract void accelerate();
    abstract void braking();


}
