import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();

        compareStrings(str1, str2);
    }

    public static void compareStrings(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order.");
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2 + " in lexicographical order.");
        } else {
            System.out.println(str1 + " is equal to " + str2 + " in lexicographical order.");
        }
    }
}