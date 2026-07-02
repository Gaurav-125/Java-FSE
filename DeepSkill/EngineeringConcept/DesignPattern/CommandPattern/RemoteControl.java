package CommandPattern;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void executeCommand(){

        if(command==null){
            System.out.println("No Command Given");
            return;
        }
        command.execute();
    }
}
