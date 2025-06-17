import java.util.Scanner;

public class LineEquationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter coordinates for two points:");
        
        System.out.print("Point 1 (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Point 2 (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distance = calculateDistance(x1, y1, x2, y2);
        
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];
        
        System.out.println("\nResults:");
        System.out.println("Points: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
        System.out.println("Euclidean distance: " + distance);
        
        if (Double.isInfinite(slope)) {
            System.out.println("Line equation: x = " + x1);
        } else {
            System.out.println("Line equation: y = " + slope + "x + " + yIntercept);
        }
        
        scanner.close();
    }
    
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        
        if (x2 - x1 == 0) {
            equation[0] = Double.POSITIVE_INFINITY;
            equation[1] = 0; 
        } else {
            equation[0] = (y2 - y1) / (x2 - x1);
            
            equation[1] = y1 - equation[0] * x1;
        }
        
        return equation;
    }
}