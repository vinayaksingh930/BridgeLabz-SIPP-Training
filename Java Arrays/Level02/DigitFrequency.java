import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        if (number < 0) {
            number = -number;
        }
        
        if (number == 0) {
            System.out.println("The number is 0");
            System.out.println("Frequency of 0: 1");
            return;
        }
        
        int digitCount = 0;
        long tempNumber = number;
        
        while (tempNumber > 0) {
            digitCount++;
            tempNumber /= 10;
        }
        
        int[] digits = new int[digitCount];
        tempNumber = number;
        
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int)(tempNumber % 10);
            tempNumber /= 10;
        }
        
        int[] frequency = new int[10];
        
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        System.out.println("Original number: " + number);
        
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + ": " + frequency[i]);
            }
        }
        
    }
}