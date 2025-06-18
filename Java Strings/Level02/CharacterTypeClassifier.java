import java.util.Scanner;

public class CharacterTypeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[][] characterTypes = classifyCharacters(text);
        
        System.out.println("\nCharacter Classification:");
        System.out.println("Character\tType");
        
        for (String[] charType : characterTypes) {
            System.out.println(charType[0] + "\t\t" + charType[1]);
        }
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
    
    public static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        
        return result;
    }
    
    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}