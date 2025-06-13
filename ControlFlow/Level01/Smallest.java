package ControlFlow.Level01;
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();

        boolean isSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
