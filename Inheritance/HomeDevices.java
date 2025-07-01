class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println(deviceId + " " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println(temperatureSetting);
    }
}
public class HomeDevices {
    public static void main(String[] args) {
        Device thermostat = new Thermostat(1, "On", 22);
        thermostat.displayStatus(); // Output: 1 On 22
    }
}