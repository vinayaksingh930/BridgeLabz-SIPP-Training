abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm);
    }
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // Discount for bikes
    }
}



public class Ride {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C123", "Prachi", 10);
        Vehicle v2 = new Bike("B456", " Vinayak", 5);

        v1.getVehicleDetails();
        System.out.println("Fare: " + v1.calculateFare(10));

        v2.getVehicleDetails();
        System.out.println("Fare: " + v2.calculateFare(10));
    }
}