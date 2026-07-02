package CommandPattern;

public class LighOnCommand implements Command{
    private Light light;

    LighOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.turnOn();
    }
}
