import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        int[] counts = countVowelsAndConsonants(text);
        
        System.out.println("\nAnalysis results:");
        System.out.println("Total characters: " + text.length());
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        System.out.println("Other characters: " + (text.length() - counts[0] - counts[1]));
        
    }
    
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        
        return "Not a Letter";
    }
    
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        
        return new int[]{vowels, consonants};
    }
}