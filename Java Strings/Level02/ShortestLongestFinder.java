import java.util.Scanner;

public class ShortestLongestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String[] words = splitText(text);
        String[][] wordLengths = getWordsWithLength(words);
        int[] minMaxIndices = findShortestAndLongestWords(wordLengths);
        
        System.out.println("\nAnalysis results:");
        System.out.println("Total words: " + words.length);
        System.out.println("Shortest word: " + wordLengths[minMaxIndices[0]][0] +    " (length: " + wordLengths[minMaxIndices[0]][1] + ")");
        System.out.println("Longest word: " + wordLengths[minMaxIndices[1]][0] +  " (length: " + wordLengths[minMaxIndices[1]][1] + ")");
        
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
    
    public static int[] findShortestAndLongestWords(String[][] wordLengths) {
        int minIndex = 0;
        int maxIndex = 0;
        
        for (int i = 1; i < wordLengths.length; i++) {
            int currentLength = Integer.parseInt(wordLengths[i][1]);
            int minLength = Integer.parseInt(wordLengths[minIndex][1]);
            int maxLength = Integer.parseInt(wordLengths[maxIndex][1]);
            
            if (currentLength < minLength) {
                minIndex = i;
            }
            
            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }
        
        return new int[]{minIndex, maxIndex};
    }
}