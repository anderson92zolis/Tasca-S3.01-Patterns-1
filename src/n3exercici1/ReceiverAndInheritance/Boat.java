package n3exercici1.ReceiverAndInheritance;

public class Boat extends Vehicle {

    private String boatRegistration;

    public Boat(String boatRegistration) {
        this.boatRegistration = boatRegistration;
    }

    @Override
    public void start(){
        System.out.println("The boat has started: "+ boatRegistration );
    }

    @Override
    public void  accelerate() {
        System.out.println("The boat has accelerated: "+ boatRegistration );

    }
    @Override
    public void braking() {
        System.out.println("The boat has braked: "+ boatRegistration );
    }
}

