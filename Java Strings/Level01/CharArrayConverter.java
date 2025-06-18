import java.util.Scanner;

public class CharArrayConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        char[] customCharArray = stringToCharArray(text);
        
        char[] builtInCharArray = text.toCharArray();
        
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);
        
        System.out.println("\nResults:");
        System.out.println("Original string: " + text);
        
        System.out.print("Custom char array: ");
        for (char c : customCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.print("Built-in char array: ");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("Are arrays equal? " + areEqual);
        
        scanner.close();
    }
    
    public static char[] stringToCharArray(String text) {
        char[] charArray = new char[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        
        return charArray;
    }
    
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}