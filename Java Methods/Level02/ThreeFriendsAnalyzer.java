import java.util.Scanner;

public class ThreeFriendsAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter details for the three friends:");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i] + ":");
            
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        
        int youngestIndex = findYoungestFriend(ages);
        
        int tallestIndex = findTallestFriend(heights);
        
        System.out.println("\n--- Results ---");
        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
        
    }
    
    public static int findYoungestFriend(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int findTallestFriend(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}