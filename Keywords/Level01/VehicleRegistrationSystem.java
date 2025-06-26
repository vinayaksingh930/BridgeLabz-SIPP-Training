class Vehicle {
    private static double registrationFee = 500.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("ABC123", "Alice", "Car");
        Vehicle vehicle2 = new Vehicle("XYZ456", "Bob", "Bike");

        vehicle1.displayDetails();
        vehicle2.displayDetails();

        Vehicle.updateRegistrationFee(600.0);
        vehicle1.displayDetails();
    }
}