import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String customUppercase = convertToUppercase(text);
        
        String builtInUppercase = text.toUpperCase();
        
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);
        
        System.out.println("\nResults:");
        System.out.println("Original text: " + text);
        System.out.println("Custom uppercase: " + customUppercase);
        System.out.println("Built-in uppercase: " + builtInUppercase);
        System.out.println("Are equal? " + areEqual);
        
    }
    
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32)); 
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