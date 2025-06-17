import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the dividend: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        
        int[] result = findRemainderAndQuotient(number, divisor);
        
        System.out.println(number + " divided by " + divisor + " gives:");
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        
        result[0] = number / divisor; 
        result[1] = number % divisor; 
        
        return result;
    }
}