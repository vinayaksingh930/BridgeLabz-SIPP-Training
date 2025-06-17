import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter coordinates for three points:");
        
        System.out.print("Point 1 (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Point 2 (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        System.out.print("Point 3 (x3 y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        
        boolean areCollinearBySlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areCollinearByArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        
        System.out.println("\nResults:");
        System.out.println("Points: (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + ")");
        System.out.println("Are points collinear (using slope method): " + areCollinearBySlope);
        System.out.println("Are points collinear (using area method): " + areCollinearByArea);
        
        scanner.close();
    }
    
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x2 == x3 && y2 == y3)) {
            return true;
        }
        
        if (x1 == x2 && x2 == x3) {
            return true;
        }
        
        double slopeAB = (x2 - x1 == 0) ? Double.MAX_VALUE : (y2 - y1) / (x2 - x1);
        double slopeBC = (x3 - x2 == 0) ? Double.MAX_VALUE : (y3 - y2) / (x3 - x2);
        
        double epsilon = 0.0000001;
        return Math.abs(slopeAB - slopeBC) < epsilon;
    }
    
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        double epsilon = 0.0000001;
        return area < epsilon;
    }
}