package n3exercici1.extend;

public class Bike extends vehicle {

    private String bicycleRegistration;

    public Bike(int speed, String bicycleRegistration) {
        super(speed);
        this.bicycleRegistration = bicycleRegistration;
    }

    @Override
    void start(){
        System.out.println("The bike has started: "+ bicycleRegistration );
    }

    @Override
    void accelerate() {
        System.out.println("The bike has accelerated: "+ bicycleRegistration );

    }

    @Override
    void braking() {
        System.out.println("The bike has braked: "+ bicycleRegistration );
    }
}

