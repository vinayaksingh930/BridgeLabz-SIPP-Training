class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(seatCapacity);
    }
}

class Truck extends Vehicle {
    Truck(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel");
        Vehicle motorcycle = new Motorcycle(150, "Petrol");

        car.displayInfo(); // Output: 180 Petrol 5
        truck.displayInfo(); // Output: 120 Diesel
        motorcycle.displayInfo(); // Output: 150 Petrol
    }
}
// Output: