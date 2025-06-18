import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] names = new String[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");
        
        try {
            System.out.println("Calling method that generates exception...");
            generateArrayIndexOutOfBoundsException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nCalling method that handles exception...");
        handleArrayIndexOutOfBoundsException(names);
        
        System.out.println("\nProgram completed successfully!");
        
    }
    
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        String name = names[names.length];
        System.out.println("Name at position " + names.length + ": " + name); 
    }
    
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            String name = names[names.length];
            System.out.println("Name at position " + names.length + ": " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("The array length is " + names.length + ". Valid indices are 0 to " + (names.length - 1) + ".");
        } catch (Exception e) {
            System.out.println("Generic exception caught: " + e.getMessage());
        }
    }
}