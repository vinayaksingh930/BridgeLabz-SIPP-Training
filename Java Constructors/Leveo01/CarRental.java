public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
        this.totalCost = 0.0;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays * 50.0;
    }
}