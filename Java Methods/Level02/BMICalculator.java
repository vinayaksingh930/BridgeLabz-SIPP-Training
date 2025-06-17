import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int TEAM_SIZE = 10;
        
        double[][] personData = new double[TEAM_SIZE][3];
        String[] weightStatus = new String[TEAM_SIZE];
        
        System.out.println("Enter details for " + TEAM_SIZE + " team members:");
        
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            System.out.print("Enter weight (in kg): ");
            personData[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (in cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        
        calculateBMI(personData);
        
        weightStatus = determineBMIStatus(personData);
        
        System.out.println("\n--- BMI Results ---");
        
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
        
        scanner.close();
    }
    
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double heightInMeters = personData[i][1] / 100.0;
            
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);
        }
    }
    
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25.0) {
                status[i] = "Normal weight";
            } else if (bmi < 30.0) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        return status;
    }
}