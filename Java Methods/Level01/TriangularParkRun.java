import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the lengths of the three sides of the triangular park (in meters):");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        
        int rounds = calculateRounds(side1, side2, side3);
        
        System.out.println("To complete a 5 km run, the athlete must complete " + rounds + " rounds.");
    }
    
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; 
        
        return (int) Math.ceil(distance / perimeter);
    }
}