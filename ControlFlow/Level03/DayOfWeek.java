import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter day: ");
        int d = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt();
        
        if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1) {
            System.out.println("Invalid date input");
            return;
        }
        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + (31*m0)/12) % 7;
        
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                        "Thursday", "Friday", "Saturday"};
        
        System.out.println("Date: " + m + "/" + d + "/" + y);
        System.out.println("Day of week: " + dayOfWeek + " (" + days[dayOfWeek] + ")");
        
        scanner.close();
    }
}