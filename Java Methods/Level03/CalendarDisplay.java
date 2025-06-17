import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
         int month = scanner.nextInt();
       // int month = 4;
        
        System.out.print("Enter year: ");
         int year = scanner.nextInt();
       // int year = 2023;
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Month should be between 1 and 12.");
            return;
        }
        
        if (year < 1) {
            System.out.println("Invalid year. Year should be positive.");
            return;
        }
        
        String monthName = getMonthName(month);
        
        int daysInMonth = getDaysInMonth(month, year);
        
        int firstDay = getFirstDayOfMonth(month, year);
        
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        
        if ((daysInMonth + firstDay) % 7 != 0) {
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
    
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return days[month - 1];
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getFirstDayOfMonth(int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        
        int k = year % 100;
        int j = year / 100;
        
        int dayOfWeek = (1 + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        return (dayOfWeek + 6) % 7;
    }
}