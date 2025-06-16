import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            number = -number;
        }
        
        if (number == 0) {
            System.out.println("Number of digits: 1");
            return;
        }
        
        int count = 0;
        int originalNumber = number;
        
        while (number != 0) {
            number = number / 10;
            count++;
        }
        
        System.out.println("Number of digits in " + originalNumber + ": " + count);
        
        scanner.close();
    }
}