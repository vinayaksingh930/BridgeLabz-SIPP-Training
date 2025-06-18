import java.util.Scanner;

public class StringLengthWithoutBuiltIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        int customLength = findLengthWithoutBuiltIn(input);
        int builtInLength = input.length();
        
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);
        System.out.println("Both methods give the same result: " + (customLength == builtInLength));
        
        scanner.close();
    }
    
    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}