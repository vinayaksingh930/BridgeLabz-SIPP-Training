public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        
        try {
            System.out.println("Calling method that generates exception...");
            generateNullPointerException();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nCalling method that handles exception...");
        handleNullPointerException();
        
        System.out.println("\nProgram completed successfully!");
    }
    
    public static void generateNullPointerException() {
        String text = null;
        
        int length = text.length();
        System.out.println("Text length: " + length); 
    }
    
    public static void handleNullPointerException() {
        String text = null;
        
        try {
            int length = text.length();
            System.out.println("Text length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("The text variable is null. Cannot perform operations on null.");
        } catch (Exception e) {
            System.out.println("Generic exception caught: " + e.getMessage());
        }
    }
}