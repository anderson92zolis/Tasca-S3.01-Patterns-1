package n3exercici1.extend;

public class Car extends vehicle {

    private String carPlate;

    public Car(int speed, String carPlate) {
        super(speed);
        this.carPlate = carPlate;
    }

    @Override
    void start(){
        System.out.println("The car has started: "+ carPlate );
    }

    @Override
    void accelerate() {
        System.out.println("The car has accelerated: "+ carPlate );

    }

    @Override
    void braking() {
        System.out.println("The car has braked: "+ carPlate );
    }
}
