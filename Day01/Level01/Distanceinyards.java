import java.util.Scanner;

 

public class Distanceinyards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.printf("Distance in yards is %.2f while in miles is %.5f%n", distanceInYards, distanceInMiles);
    }
}
