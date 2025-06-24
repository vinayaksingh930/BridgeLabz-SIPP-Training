public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}