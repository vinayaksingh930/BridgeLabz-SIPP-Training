package ControlFlow.Level01;
import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer (natural number).");
            return;
        }

        int sumWhile = 0, i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumWhile == sumFormula) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("There is a mismatch in the computations.");
        }
    }
}
