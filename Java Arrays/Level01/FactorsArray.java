import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        System.out.println("\nFinding factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    
                    factors = temp;
                    System.out.println("Resized factors array to " + maxFactor + " elements");
                }
                
                factors[index] = i;
                index++;
            }
        }
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        
        System.out.println("\nTotal number of factors: " + index);
    }
}