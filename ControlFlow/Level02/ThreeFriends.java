import java.util.Scanner;

public class ThreeFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        
        // Input heights
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();
        
        // Find youngest friend
        String youngest;
        int minAge = amarAge;
        youngest = "Amar";
        
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngest = "Anthony";
        }
        
        // Find tallest friend
        String tallest;
        double maxHeight = amarHeight;
        tallest = "Amar";
        
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallest = "Anthony";
        }
        
        System.out.println("Youngest friend: " + youngest + " (Age: " + minAge + ")");
        System.out.println("Tallest friend: " + tallest + " (Height: " + maxHeight + " cm)");
        
        scanner.close();
    }
}