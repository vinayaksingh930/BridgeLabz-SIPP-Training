import java.util.Scanner;

public class TextSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");
        
        boolean areEqual = compareStringArrays(customSplit, builtInSplit);
        
        System.out.println("\nSplit using custom method:");
        for (String word : customSplit) {
            System.out.println(word);
        }
        
        System.out.println("\nSplit using built-in method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        
        System.out.println("\nBoth methods give the same result: " + areEqual);
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
    
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        
        return true;
    }
}