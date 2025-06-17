import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        if (numStudents <= 0) {
            System.out.println("Please enter a positive number of students.");
            return;
        }
        
        double[][] scores = generateRandomScores(numStudents);
        
        double[][] statistics = calculateStatistics(scores);
        
        displayScorecard(scores, statistics);
        
        scanner.close();
    }
    
    public static double[][] generateRandomScores(int numStudents) {
        double[][] scores = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90); // Physics
            scores[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int)(Math.random() * 90); // Math
        }
        
        return scores;
    }
    
    public static double[][] calculateStatistics(double[][] scores) {
        int numStudents = scores.length;
        double[][] statistics = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            statistics[i][0] = Math.round(total * 100) / 100.0;
            
            double average = total / 3;
            statistics[i][1] = Math.round(average * 100) / 100.0;
            
            double percentage = (total / 300) * 100;
            statistics[i][2] = Math.round(percentage * 100) / 100.0;
        }
        
        return statistics;
    }
    
    public static void displayScorecard(double[][] scores, double[][] statistics) {
        int numStudents = scores.length;
        
        System.out.println("\nStudent Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println(
                (i+1) + "\t" + 
                scores[i][0] + "\t" + 
                scores[i][1] + "\t\t" + 
                scores[i][2] + "\t" + 
                statistics[i][0] + "\t" + 
                statistics[i][1] + "\t" + 
                statistics[i][2] + "%"
            );
        }
    }
}