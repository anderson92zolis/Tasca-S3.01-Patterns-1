package n3exercici1.extend;

public abstract class vehicle {
    private int speed;

    public vehicle(int speed) {
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
