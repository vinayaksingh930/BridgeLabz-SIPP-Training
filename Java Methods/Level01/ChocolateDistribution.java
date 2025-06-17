import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be positive.");
            return;
        }
        
        int[] result = printChocolate(numberOfChocolates, numberOfChildren);
        
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
    
    public static int[] printChocolate(int number, int divisor) {
        int[] result = new int[2];
        
        result[0] = number / divisor; 
        result[1] = number % divisor; 
        
        return result;
    }
}