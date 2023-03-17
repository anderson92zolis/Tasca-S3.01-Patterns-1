package n3exercici1.ReceiverAndInheritance;

public class Plane extends Vehicle {

    private String planeRegistration;

    public Plane(String planeRegistration) {
        this.planeRegistration = planeRegistration;
    }

    @Override
    public void start(){
        System.out.println("The plane has started: "+ planeRegistration );
    }

    @Override
    public void accelerate() {
        System.out.println("The plane has accelerated: "+ planeRegistration );

    }

    @Override
    public void braking() {
        System.out.println("The plane has braked: "+ planeRegistration );
    }
}
