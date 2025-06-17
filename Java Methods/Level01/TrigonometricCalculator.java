import java.util.Scanner;

public class TrigonometricCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an angle in degrees: ");
        double angleDegrees = scanner.nextDouble();
        
        double[] trigValues = calculateTrigonometricFunctions(angleDegrees);
        
        System.out.println("Trigonometric values for " + angleDegrees + " degrees:");
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
    
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];
        
        double radians = Math.toRadians(angle);
        
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        
        return result;
    }
}