public class DecreaseVolumeCommand implements Command {
    private TV tv;
    private int volume;

    public DecreaseVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    public void execute() {
        tv.adjustVolume(volume);
    }
}
