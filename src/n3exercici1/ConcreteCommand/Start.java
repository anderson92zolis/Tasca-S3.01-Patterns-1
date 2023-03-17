package n3exercici1.ConcreteCommand;

import n3exercici1.ICommand;
import n3exercici1.ReceiverAndInheritance.Vehicle;

public class Start implements ICommand {

    private Vehicle vehicle;


    public Start(Vehicle vehicle) {
        this.vehicle = vehicle;

    }

    @Override
    public void execute() {
        this.vehicle.start();
    }
}
