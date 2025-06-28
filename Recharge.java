import java.util.*;
public class Recharge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int am = 0;
        System.out.println("Welcome to Mobile Recharge Service!");
        System.out.println("Enter 1 to recharge or 0 to check am:");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Select your operator:");
            System.out.println("1. Airtel Pack: ₹399, 28 days, 1.5GB/day");
            System.out.println("2. Vi Pack: ₹300, 28 days, 1GB/day");
            System.out.println("3. Jio Pack: ₹299, 28 days, 2GB/day");
            System.out.println("4. BSNL Pack: ₹100, 30 days, 500MB/day");
            System.out.println("1. Airtel\n2. Vi\n3. Jio\n4. BSNL");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    am += 399;
                    System.out.println("Airtel recharge successful.");
                    break;
                case 2:
                    am += 300;
                    System.out.println("Vi recharge successful.");
                    break;
                case 3:
                    am += 299;
                    System.out.println("Jio recharge successful.");
                    break;
                case 4:
                    am += 100;
                    System.out.println("BSNL recharge successful.");
                    break;
                default:
                    System.out.println("Invalid operator selection.");
                    return;
            }
            System.out.println("The recharge amount is: " + am);
        } else if (n == 0) {
            System.out.println("Your current amount is: " + am);
        } else {
            System.out.println("Invalid choose. Please enter 1 or 0.");
        }
    }
}
