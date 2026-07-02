package CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();

        Command lightOn=new LighOnCommand(light);
        Command lightOff=new LightOffCommand(light);

        RemoteControl remote=new RemoteControl();

        remote.setCommand(lightOn);
        remote.executeCommand();

        remote.setCommand(lightOff);
        remote.executeCommand();
    }
}
