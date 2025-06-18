import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        int[] ages = generateRandomAges(numStudents);
        String[][] voteStatus = checkVotingEligibility(ages);
        
        displayVotingStatus(voteStatus);
    }
    
    public static int[] generateRandomAges(int count) {
        int[] ages = new int[count];
        
        for (int i = 0; i < count; i++) {
            ages[i] = 10 + (int)(Math.random() * 16);
        }
        return ages;
    }
    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }
    
    public static void displayVotingStatus(String[][] voteStatus) {
        System.out.println("\nStudent Voting Eligibility:");
        System.out.println("Student\tAge\tCan Vote");
        
        for (int i = 0; i < voteStatus.length; i++) {
            System.out.println((i+1) + "\t" + voteStatus[i][0] + "\t" +  (voteStatus[i][1].equals("true") ? "Yes" : "No"));
        }
    }
}