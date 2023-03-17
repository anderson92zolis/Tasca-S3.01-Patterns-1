package n3exercici1.ReceiverAndInheritance;

public class Bike extends Vehicle {

    private String bicycleRegistration;

    public Bike( String bicycleRegistration) {
        this.bicycleRegistration = bicycleRegistration;
    }

    @Override
    public void start(){
        System.out.println("The bike has started: "+ bicycleRegistration );
    }

    @Override
    public void accelerate() {
        System.out.println("The bike has accelerated: "+ bicycleRegistration );

    }

    @Override
    public void braking() {
        System.out.println("The bike has braked: "+ bicycleRegistration );
    }
}

