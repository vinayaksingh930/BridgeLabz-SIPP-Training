import java.util.Scanner;

public class StringTrimmer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with leading/trailing spaces: ");
        String text = scanner.nextLine();
        
        int[] trimIndices = findTrimIndices(text);
        String customTrimmed = createSubstring(text, trimIndices[0], trimIndices[1]);
        String builtInTrimmed = text.trim();
        
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        
        System.out.println("\nOriginal string: \"" + text + "\"");
        System.out.println("Custom trimmed: \"" + customTrimmed + "\"");
        System.out.println("Built-in trimmed: \"" + builtInTrimmed + "\"");
        System.out.println("Both methods give the same result: " + areEqual);
        
    }
    
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end + 1};
    }
    
    public static String createSubstring(String text, int start, int end) {
        if (start >= end) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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