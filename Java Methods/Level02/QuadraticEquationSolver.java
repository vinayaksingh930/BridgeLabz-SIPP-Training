import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quadratic Equation Solver (ax² + bx + c = 0)");
        
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        double[] roots = findRoots(a, b, c);
        
        if (roots.length == 0) {
            System.out.println("No real roots exist for this equation.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }
        
        scanner.close();
    }
    
    public static double[] findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a = 0).");
            return new double[0];
        }
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            double[] roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else if (delta == 0) {
            double[] roots = new double[1];
            roots[0] = -b / (2 * a);
            return roots;
        } else {
            return new double[0];
        }
    }
}