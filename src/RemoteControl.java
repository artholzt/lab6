public class RemoteControl {
    private Command[] commands;

    //channel and volume!!!!!!!!!!!!!!!
    public RemoteControl(TV tv) {
        commands = new Command[4];
        commands[0] = new TurnOnCommand(tv);
        commands[1] = new TurnOffCommand(tv);
        commands[2] = new ChangeChannelCommand(tv, 5);
        commands[3] = new AdjustVolumeCommand(tv, 10);
    }

    public void pressButton(int buttonIndex) {
        commands[buttonIndex].execute();
    }
}
