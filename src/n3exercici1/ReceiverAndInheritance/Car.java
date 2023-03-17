package n3exercici1.ReceiverAndInheritance;

public class Car extends Vehicle {

    private String carPlate;

    public Car(String carPlate) {

        this.carPlate = carPlate;
    }

    @Override
    public void start(){
        System.out.println("The car has started: "+ carPlate );
    }

    @Override
    public void accelerate() {
        System.out.println("The car has accelerated: "+ carPlate );

    }

    @Override
    public void braking() {
        System.out.println("The car has braked: "+ carPlate );
    }
}
