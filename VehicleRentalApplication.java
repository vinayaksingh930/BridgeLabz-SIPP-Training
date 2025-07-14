
import java.util.Scanner;

/*Vehicle Rental Application Scenario:
Build a system for renting bikes, cars, and trucks to customers.

Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer (Scenario-based problems)
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)

OOP Concepts:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters
*/

// Interface
interface Rentable {
    double calculateRent(int days);
}

// Abstract class for Vehicle
abstract class Vehicle implements Rentable {
    protected String vehicleId;
    protected String brand;
    protected double baseRate;

    // Constructor method
    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Getter method
    public String getVehicleId() {
        return vehicleId;
    }

    // Setter Method
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    // Getter Method
    public String getBrand() {
        return brand;
    }

    // Setter method
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter Method
    public double getBaseRate() {
        return baseRate;
    }

    // Setter Method
    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }
}

// Bike class extending Vehicle
class Bike extends Vehicle {

    // Constructor
    public Bike(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    // Override the calculateRent method
    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        return rent;
    }
}

// Car class extending Vehicle
class Car extends Vehicle {

    public Car(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        return rent;
    }
}

// Truck class extending Vehicle
class Truck extends Vehicle {

    public Truck(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        return rent;
    }
}

// Customer class
class Customer {
    private String Id;
    private String name;
    private Vehicle rentedVehicle;
    private int rentalDays;

    public Customer(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public String getCustomerId() {
        return Id;
    }

    public void setCustomerId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to rent a vehicle
    public void rentVehicle(Vehicle vehicle, int days) {
        this.rentedVehicle = vehicle;
        this.rentalDays = days;
    }

    // Method to calculate the total rent for the rented vehicle
    public double calculateTotalRent() {
        if (rentedVehicle != null) {
            return rentedVehicle.calculateRent(rentalDays);
        } else {
            System.out.println("No vehicle rented.");
            return 0;
        }
    }

    // Method to display rental details
    public void displayRentalDetails() {
        if (rentedVehicle != null) {
            double baseRent = rentedVehicle.getBaseRate() * rentalDays;
            System.out.println("Customer: " + name);
            System.out.println("Rented Vehicle: " + rentedVehicle.getBrand() + " (" + rentedVehicle.getVehicleId() + ")");
            System.out.println("Rental Days: " + rentalDays);
//            System.out.println("Base Rent: " + baseRent);
            System.out.println("Total Rent: " + calculateTotalRent());
        } else {
            System.out.println("No vehicle rented by " + name);
        }
    }
}

// Main class
public class VehicleRentalApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create vehicles
        Bike bike = new Bike("01", "Yamaha", 15);
        Car car = new Car("02", "Toyota", 50);
        Truck truck = new Truck("03", "Volvo", 100);

        // Create a customer
        System.out.print("Enter Customer ID: ");
        String Id = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String Name = scanner.nextLine();
        Customer customer = new Customer(Id, Name);

        // Prompt user to choose a vehicle
        System.out.println("Choose a vehicle to rent:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Truck");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        // Prompt user to enter rental days
        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();

        // Rent the chosen vehicle
        switch (choice) {
            case 1:
                customer.rentVehicle(bike, rentalDays);
                break;
            case 2:
                customer.rentVehicle(car, rentalDays);
                break;
            case 3:
                customer.rentVehicle(truck, rentalDays);
                break;
            default:
                System.out.println("Invalid choice. No vehicle rented.");
                return;
        }

        // Display rental details
        customer.displayRentalDetails();
    }
}
