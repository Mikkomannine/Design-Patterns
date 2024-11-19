package Bridge.Devices;

import Bridge.Remote.BasicRemote;
public class SmartTV implements Device {
    private boolean on = false;
    private int volume = 50;
    private int channel = 1;
    private String internetPage = "Home";

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("SmartTV is now ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("SmartTV is now OFF.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 0 && percent <= 100) {
            volume = percent;
            System.out.println("Volume set to: " + volume + "%");
        } else {
            System.out.println("Invalid volume level.");
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel > 0) {
            this.channel = channel;
            System.out.println("Channel set to: " + channel);
        } else {
            System.out.println("Invalid channel.");
        }
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("SmartTV Status:");
        System.out.println("Power: " + (on ? "ON" : "OFF"));
        System.out.println("Volume: " + volume + "%");
        System.out.println("Channel: " + channel);
        System.out.println("Current Internet Page: " + internetPage);
        System.out.println("------------------------------------");
    }

    // Additional method specific to SmartTV
    public void browseInternet(String page) {
        if (on) {
            internetPage = page;
            System.out.println("Browsing: " + internetPage);
        } else {
            System.out.println("Cannot browse internet. SmartTV is OFF.");
        }
    }
}

