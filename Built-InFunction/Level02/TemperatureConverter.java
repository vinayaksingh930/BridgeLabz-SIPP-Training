import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();
        System.out.println("Convert to (1) Celsius or (2) Fahrenheit?");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Temperature in Celsius: " + toCelsius(temp));
        } else if (choice == 2) {
            System.out.println("Temperature in Fahrenheit: " + toFahrenheit(temp));
        }
    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}