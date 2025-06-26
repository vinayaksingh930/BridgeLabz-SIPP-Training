import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to remove:");
        char toRemove = scanner.next().charAt(0);

        String result = removeCharacter(input, toRemove);
        System.out.println("Modified String: " + result);
    }

    public static String removeCharacter(String str, char toRemove) {
        return str.replace(String.valueOf(toRemove), "");
    }
}