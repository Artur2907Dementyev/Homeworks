package lesson24.classwork0605.example02.classwork2904.HW;

public class Main {public static void main(String[] args) {
    // Create a TV with a maximum of 10 channels
    TV myTV = new TV(10);

    // Create a remote control
    RemoteControl myRemote = new RemoteControl();

    // Demonstrate switching channels
    myRemote.switchChannelForward(myTV); // Switches to channel 2
    myRemote.switchChannelRandom(myTV, 5); // Switches to channel 5
    myRemote.switchChannelBack(myTV); // Switches back to channel 4

    // Print the current channel
    System.out.println("Current channel: " + myTV.getCurrentChannel());
}
}
