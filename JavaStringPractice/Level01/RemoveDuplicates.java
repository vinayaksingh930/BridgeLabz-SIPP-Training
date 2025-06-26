import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("Modified String: " + result);
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }
}