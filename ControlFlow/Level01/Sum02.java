package ControlFlow.Level01;
import java.util.Scanner;
public class Sum02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.println("Enter numbers to sum (0 or negative to stop):");
        while (true) {
            number = scanner.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }
        System.out.println("Total sum (stop at 0 or negative): " + total);

    }
}
