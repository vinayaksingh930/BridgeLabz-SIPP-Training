interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling");
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle tesla = new ElectricVehicle(250, "Tesla Model S");
        Vehicle ford = new PetrolVehicle(200, "Ford Mustang");

        System.out.println("Electric Vehicle: " + tesla.model + ", Max Speed: " + tesla.maxSpeed);
        ((ElectricVehicle) tesla).charge(); // Output: Charging

        System.out.println("Petrol Vehicle: " + ford.model + ", Max Speed: " + ford.maxSpeed);
        ((PetrolVehicle) ford).refuel(); // Output: Refueling
    }
}