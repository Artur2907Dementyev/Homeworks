package lesson24.classwork0605.example02.classwork2904.HW;

public class RemoteControl {
    private int frequency; // Represents the frequency (channel number)

    public RemoteControl() {
        this.frequency = 1; // Start with channel 1
    }

    // Accessor for current channel
    public int getCurrentChannel() {
        return frequency;
    }

    // Method to switch channel forward
    public void switchChannelForward(TV tv) {
        if (tv.getCurrentChannel() == frequency) {
            tv.switchChannelForward();
        }
    }

    // Method to switch channel back
    public void switchChannelBack(TV tv) {
        if (tv.getCurrentChannel() == frequency) {
            tv.switchChannelBack();
        }
    }

    // Method to switch channel randomly (transmit channel number)
    public void switchChannelRandom(TV tv, int channel) {
        if (tv.getCurrentChannel() == frequency) {
            tv.switchChannelRandom(channel);
        }
    }
}
