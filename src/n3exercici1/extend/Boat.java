package n3exercici1.extend;

public class Boat extends vehicle{

    private String boatRegistration;

    public Boat(int speed, String boatRegistration) {
        super(speed);
        this.boatRegistration = boatRegistration;
    }

    @Override
    void start(){
        System.out.println("The boat has started: "+ boatRegistration );
    }

    @Override
    void accelerate() {
        System.out.println("The boat has accelerated: "+ boatRegistration );

    }

    @Override
    void braking() {
        System.out.println("The boat has braked: "+ boatRegistration );
    }
}

