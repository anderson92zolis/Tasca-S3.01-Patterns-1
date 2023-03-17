package n3exercici1;


import n3exercici1.ConcreteCommand.Accelerate;
import n3exercici1.ConcreteCommand.Braking;
import n3exercici1.ConcreteCommand.Start;
import n3exercici1.Invoker.Invoker;
import n3exercici1.ReceiverAndInheritance.Bike;
import n3exercici1.ReceiverAndInheritance.Boat;
import n3exercici1.ReceiverAndInheritance.Car;

public class Main {
    public static void main(String[] args) {
    Invoker newCar= new Invoker();
    //Car

        newCar.setICommand(new Start(new Car("1234ABC")));
        newCar.executeCommand();


    // Bike


        newCar.setICommand(new Accelerate(new Bike("PI145234")));
        newCar.executeCommand();



    // Boat
        newCar.setICommand(new Braking(new Boat("EP12122")));
        newCar.executeCommand();
    }

}