package Bridge.Remote;

import Bridge.Devices.Device;
import Bridge.Devices.SmartTV;


public class SmartRemote implements Remote {
    protected Device device;

    public SmartRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
    public void voiceControl(String command) {
        System.out.println("Executing voice command: " + command);
        if (command.equalsIgnoreCase("increase volume")) {
            volumeUp();
        } else if (command.equalsIgnoreCase("decrease volume")) {
            volumeDown();
        } else if (command.equalsIgnoreCase("next channel")) {
            channelUp();
        } else if (command.equalsIgnoreCase("previous channel")) {
            channelDown();
        } else if (command.toLowerCase().startsWith("browse ")) {
            if (device instanceof SmartTV) {
                String page = command.substring(7); // Extract the page name
                ((SmartTV) device).browseInternet(page);
            } else {
                System.out.println("This device does not support browsing.");
            }
        } else {
            System.out.println("Command not recognized.");
        }
    }
}

