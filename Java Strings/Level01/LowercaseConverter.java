import java.util.Scanner;

public class LowercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String customLowercase = convertToLowercase(text);
        
        String builtInLowercase = text.toLowerCase();
        
        boolean areEqual = compareStrings(customLowercase, builtInLowercase);
        
        System.out.println("\nResults:");
        System.out.println("Original text: " + text);
        System.out.println("Custom lowercase: " + customLowercase);
        System.out.println("Built-in lowercase: " + builtInLowercase);
        System.out.println("Are equal? " + areEqual);
        
    }
    
    public static String convertToLowercase(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32)); 
            } else {
                result.append(c); 
            }
        }
        
        return result.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}