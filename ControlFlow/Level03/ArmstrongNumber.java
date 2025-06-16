import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int originalNumber = number;
        
        System.out.println("Checking if " + number + " is an Armstrong number:");
        System.out.print("Calculation: ");
        
        boolean first = true;
        int tempNumber = number;
        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            int cube = digit * digit * digit;
            sum += cube;
            
            if (!first) {
                System.out.print(" + ");
            }
            System.out.print(digit + "^3");
            first = false;
            
            originalNumber = originalNumber / 10;
        }
        
        System.out.println(" = " + sum);
        
        if (tempNumber == sum) {
            System.out.println(tempNumber + " is an Armstrong number");
        } else {
            System.out.println(tempNumber + " is not an Armstrong number");
        }
        
    }
}