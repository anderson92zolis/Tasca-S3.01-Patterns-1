package n3exercici1.Invoker;

import n3exercici1.ICommand;

public class Invoker {
    private ICommand iCommand;

    public void setICommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void executeCommand() {
      this.iCommand.execute();

    }
}
