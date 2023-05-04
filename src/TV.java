public class TV {
    private int channel;
    private int volume;
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("TV is on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is off.");
    }

    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel changed to " + channel);
    }

    public void adjustVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume adjusted to " + volume);
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", isOn=" + isOn +
                '}';
    }
}