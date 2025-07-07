import java.util.*;

abstract class Vehicle{
	String brand;
    	String model;
    	String fuelType;

    	Vehicle(String brand, String model, String fuelType) {
        	this.brand = brand;
        	this.model = model;
        	this.fuelType = fuelType;
    	}

    	abstract double calculateServiceCost();

    	abstract void printServiceDetails();
}

class Car extends Vehicle{
	Car(String brand, String model,String fuel){
		super(brand,model,fuel);
	}

	@Override
    	double calculateServiceCost() {
        	return 5000.0;
    	}

    	@Override
    	void printServiceDetails() {
        	System.out.println("Car Service Details: " + brand + " " + model + ", Cost: " + calculateServiceCost());
    	}
}

class Bike extends Vehicle {
    Bike(String brand, String model, String fuel) {
        super(brand, model, fuel);
    }

    @Override
    double calculateServiceCost() {
        return 1500.0;
    }

    @Override
    void printServiceDetails() {
        System.out.println("Bike Service Details: " + brand + " " + model + ", Cost: " + calculateServiceCost());
    }
}

class Truck extends Vehicle {
    Truck(String brand, String model, String fuel) {
        super(brand, model, fuel);
    }

    @Override
    double calculateServiceCost() {
        return 10000.0;
    }

    @Override
    void printServiceDetails() {
        System.out.println("Truck Service Details: " + brand + " " + model + ", Cost: " + calculateServiceCost());
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Corolla", "Petrol"));
        vehicles.add(new Bike("Yamaha", "R15", "Petrol"));
        vehicles.add(new Truck("Volvo", "FH16", "Diesel"));

        for (Vehicle vehicle : vehicles) {
            vehicle.printServiceDetails();
        }
    }
}
