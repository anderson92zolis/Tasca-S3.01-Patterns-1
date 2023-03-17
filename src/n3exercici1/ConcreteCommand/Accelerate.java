package n3exercici1.ConcreteCommand;

import n3exercici1.ICommand;
import n3exercici1.ReceiverAndInheritance.Vehicle;

public class Accelerate implements ICommand {

    private Vehicle vehicle;


    public Accelerate(Vehicle vehicle) {
        this.vehicle = vehicle;

    }
    @Override
    public void execute() {
        this.vehicle.accelerate();
    }
}
