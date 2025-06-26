import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char mostFrequent = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: " + mostFrequent);
    }

    public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int maxFreq = 0;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                result = c;
            }
        }
        return result;
    }
}