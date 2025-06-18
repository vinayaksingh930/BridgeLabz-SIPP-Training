import java.util.Scanner;

public class WordLengthCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String[] words = splitText(text);
        String[][] wordLengths = getWordsWithLength(words);
        
        System.out.println("\nWords and their lengths:");
        System.out.println("Word\t\tLength");
        
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t\t" + Integer.parseInt(wordLength[1]));
        }
        
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
    
    public static String[] splitText(String text) {
        int length = findLengthWithoutBuiltIn(text);
        
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        int[] spaceIndices = new int[wordCount + 1];
        spaceIndices[0] = -1;
        
        int spaceIndex = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[spaceIndex] = i;
                spaceIndex++;
            }
        }
        spaceIndices[wordCount] = length;
        
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndices[i] + 1; j < spaceIndices[i + 1]; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }
        
        return words;
    }
    
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthWithoutBuiltIn(words[i]));
        }
        
        return result;
    }
}