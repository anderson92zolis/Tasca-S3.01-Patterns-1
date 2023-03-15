package n3exercici1.extend;

public class Plane extends vehicle {

    private String planeRegistration;

    public Plane(int speed, String planeRegistration) {
        super(speed);
        this.planeRegistration = planeRegistration;
    }

    @Override
    void start(){
        System.out.println("The plane has started: "+ planeRegistration );
    }

    @Override
    void accelerate() {
        System.out.println("The plane has accelerated: "+ planeRegistration );

    }

    @Override
    void braking() {
        System.out.println("The plane has braked: "+ planeRegistration );
    }
}
