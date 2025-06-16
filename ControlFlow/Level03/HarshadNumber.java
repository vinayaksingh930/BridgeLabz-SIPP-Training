import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }
        
        int sum = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
        
        scanner.close();
    }
}