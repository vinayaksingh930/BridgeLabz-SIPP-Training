abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    public Car(String number, String type, double rate) {
        super(number, type, rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}


public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle v1 = new Car("1", "Car", 50);
        System.out.println("Rental Cost: " + v1.calculateRentalCost(5));
    }
}