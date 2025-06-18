import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text (try entering something that's not a number): ");
        String text = scanner.nextLine();
        
        System.out.println("\nDemonstrating NumberFormatException:");
        
        try {
            System.out.println("Calling method that generates exception...");
            generateNumberFormatException(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nCalling method that handles exception...");
        handleNumberFormatException(text);
        
        System.out.println("\nProgram completed successfully!");
        
    }
    
    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number parsed: " + number); 
    }
    
    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number parsed: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
            System.out.println("The text '" + text + "' cannot be converted to an integer.");
        } catch (Exception e) {
            System.out.println("Generic exception caught: " + e.getMessage());
        }
    }
}