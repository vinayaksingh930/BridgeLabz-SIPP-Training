import java.util.*;
public class ReverseString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			result.append(new StringBuilder(word).reverse().toString()).append(" ");
		}
		System.out.println(result.toString().trim());
	}
}
