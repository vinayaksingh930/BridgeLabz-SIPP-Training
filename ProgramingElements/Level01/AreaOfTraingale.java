import java.util.Scanner;

public class AreaOfTraingale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double baseInches = scanner.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double heightInches = scanner.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516;

        System.out.printf("Area of triangle: %.2f square inches\n", areaInches);
        System.out.printf("Area of triangle: %.2f square centimeters\n", areaCm);

        // Height conversions
        double heightCm = heightInches * 2.54;
        double heightFeet = heightInches / 12.0;

        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n",
                heightCm, heightFeet, heightInches);

        scanner.close();
    }
}
