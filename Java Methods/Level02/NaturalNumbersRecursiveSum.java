import java.util.Scanner;

public class NaturalNumbersRecursiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int recursiveSum = sumUsingRecursion(n);
        
        int formulaSum = sumUsingFormula(n);
        
        System.out.println("Sum of first " + n + " natural numbers:");
        System.out.println("Using recursion: " + recursiveSum);
        System.out.println("Using formula n*(n+1)/2: " + formulaSum);
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result!");
        } else {
            System.out.println("Results are different! There is an error.");
        }
        
    }
    
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }
    
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}