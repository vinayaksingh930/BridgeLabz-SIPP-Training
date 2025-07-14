public class StringBuilderReverse {
    public static String reverseString(String input) {
        // Create a StringBuilder object with the input string
        StringBuilder sb = new StringBuilder(input);
        // Use the reverse() method to reverse the string
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed); // Output: "olleh"
    }
}