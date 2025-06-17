import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + (i + 1) + ": " + numbers[i] + " is positive");
                if (isEven(numbers[i])) {
                    System.out.println(" and even");
                } else {
                    System.out.println(" and odd");
                }
            } else {
                System.out.println("Number " + (i + 1) + ": " + numbers[i] + " is negative");
            }
        }
        
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        
        System.out.println("\nComparing first and last elements:");
        if (comparisonResult == 0) {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[numbers.length - 1] + ")");
        } else if (comparisonResult == 1) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[numbers.length - 1] + ")");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[numbers.length - 1] + ")");
        }
        
    }
    
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}