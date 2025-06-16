import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        if (numPersons <= 0) {
            System.out.println("Invalid input! Number of persons must be positive.");
            return;
        }
        
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            while (true) {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = scanner.nextDouble();
                
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight! Weight must be positive.");
                } else {
                    break;
                }
            }
            
            while (true) {
                System.out.print("Enter height (in cm): ");
                personData[i][1] = scanner.nextDouble();
                
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height! Height must be positive.");
                } else {
                    break;
                }
            }
            
            double heightInMeters = personData[i][1] / 100.0;
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\n--- BMI Results ---");
        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
        
    }
}