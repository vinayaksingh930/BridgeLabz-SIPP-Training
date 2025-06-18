import java.util.Scanner;

public class SubstringCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
        
        if (startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {
            System.out.println("Invalid indices! Please ensure 0 <= startIndex <= endIndex <= " + text.length());
            scanner.close();
            return;
        }
        
        String customSubstring = createSubstring(text, startIndex, endIndex);
        
        String builtInSubstring = text.substring(startIndex, endIndex);
        
        boolean areEqual = compareStrings(customSubstring, builtInSubstring);
        
        System.out.println("\nResults:");
        System.out.println("Original string: " + text);
        System.out.println("Custom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are substrings equal? " + areEqual);
        
        scanner.close();
    }
    
    public static String createSubstring(String text, int startIndex, int endIndex) {
        StringBuilder substring = new StringBuilder();
        
        for (int i = startIndex; i < endIndex; i++) {
            substring.append(text.charAt(i));
        }
        
        return substring.toString();
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