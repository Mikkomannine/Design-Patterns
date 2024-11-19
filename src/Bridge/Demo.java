package Bridge;

import Bridge.Devices.Device;
import Bridge.Devices.Radio;
import Bridge.Devices.SmartTV;
import Bridge.Devices.Tv;
import Bridge.Remote.AdvancedRemote;
import Bridge.Remote.BasicRemote;
import Bridge.Remote.SmartRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        // Instantiate a SmartTV
        Device smartTV = new SmartTV();

        // Create a SmartRemote for the SmartTV
        SmartRemote smartRemote = new SmartRemote(smartTV);

        // Test SmartTV functionality through SmartRemote
        smartRemote.power(); // Turn on SmartTV
        smartRemote.volumeUp(); // Increase volume
        smartRemote.voiceControl("increase volume");
        smartRemote.voiceControl("next channel");
        smartRemote.voiceControl("browse Netflix");

        // Print the status of the SmartTV
        smartTV.printStatus();

        // Turn off the TV
        smartRemote.power();
        smartRemote.voiceControl("browse YouTube");
    }
}
