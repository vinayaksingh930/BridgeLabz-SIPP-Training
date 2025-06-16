import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Invalid input! Weight and height must be positive.");
            return;
        }
        
        double heightM = heightCm / 100.0;
        
        double bmi = weight / (heightM * heightM);
        
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25.0) {
            category = "Normal weight";
        } else if (bmi < 30.0) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        
        System.out.println("\n--- BMI Result ---");
        System.out.printf("Weight: %.1f kg\n", weight);
        System.out.printf("Height: %.1f cm (%.2f m)\n", heightCm, heightM);
        System.out.printf("BMI: %.2f kg/m²\n", bmi);
        System.out.println("Category: " + category);
        
        scanner.close();
    }
}