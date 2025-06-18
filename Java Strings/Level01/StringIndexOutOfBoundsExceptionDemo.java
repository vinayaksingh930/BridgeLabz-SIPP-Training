import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        
        try {
            System.out.println("Calling method that generates exception...");
            generateStringIndexOutOfBoundsException(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nCalling method that handles exception...");
        handleStringIndexOutOfBoundsException(text);
        
        System.out.println("\nProgram completed successfully!");
        
        scanner.close();
    }
    
    public static void generateStringIndexOutOfBoundsException(String text) {
        char character = text.charAt(text.length());
        System.out.println("Character at position " + text.length() + ": " + character); 
    }
    
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            char character = text.charAt(text.length());
            System.out.println("Character at position " + text.length() + ": " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("The string length is " + text.length() + ". Valid indices are 0 to " + (text.length() - 1) + ".");
        } catch (Exception e) {
            System.out.println("Generic exception caught: " + e.getMessage());
        }
    }
}