public class AdjustVolumeCommand implements Command {
    private TV tv;
    private int volume;

    public AdjustVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    public void execute() {
        tv.adjustVolume(volume);
    }
}

