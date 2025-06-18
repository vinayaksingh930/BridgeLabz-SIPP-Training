import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        System.out.println("\nDemonstrating IllegalArgumentException:");
        
        try {
            System.out.println("Calling method that generates exception...");
            generateIllegalArgumentException(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nCalling method that handles exception...");
        handleIllegalArgumentException(text);
        
        System.out.println("\nProgram completed successfully!");
        
        scanner.close();
    }
    
    public static void generateIllegalArgumentException(String text) {
        String substring = text.substring(5, 3);
        System.out.println("Substring: " + substring); 
    }
    
    public static void handleIllegalArgumentException(String text) {
        try {
            String substring = text.substring(5, 3);
            System.out.println("Substring: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            System.out.println("Cannot create substring with start index > end index.");
        } catch (Exception e) {
            System.out.println("Generic exception caught: " + e.getMessage());
        }
    }
}