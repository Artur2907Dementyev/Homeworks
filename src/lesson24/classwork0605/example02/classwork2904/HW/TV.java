package lesson24.classwork0605.example02.classwork2904.HW;

public class TV {
    private int frequency; // Represents the frequency (channel number)
    private int maxChannel; // Maximum channel number

    public TV(int maxChannel) {
        this.maxChannel = maxChannel;
        this.frequency = 1; // Start with channel 1
    }

    // Accessor for current channel
    public int getCurrentChannel() {
        return frequency;
    }

    // Method to switch channel forward
    public void switchChannelForward() {
        if (frequency < maxChannel) {
            frequency++;
        } else {
            frequency = 1; // Wrap around to channel 1
        }
    }

    // Method to switch channel back
    public void switchChannelBack() {
        if (frequency > 1) {
            frequency--;
        } else {
            frequency = maxChannel; // Wrap around to maximum channel
        }
    }

    // Method to switch channel randomly (transmit channel number)
    public void switchChannelRandom(int channel) {
        if (channel >= 1 && channel <= maxChannel) {
            frequency = channel;
        }
        // Otherwise, do nothing (invalid channel number)
    }
}