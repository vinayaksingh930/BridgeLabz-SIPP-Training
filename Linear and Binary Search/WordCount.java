import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String targetWord = "example";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The word '" + targetWord + "' appears " + count + " times.");
    }
}