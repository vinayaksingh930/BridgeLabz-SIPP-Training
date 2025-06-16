import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks in Physics: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter marks in Mathematics: ");
        double maths = scanner.nextDouble();
        
        if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || 
            maths < 0 || maths > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            return;
        }
        
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        
        String grade;
        String remarks;
        
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Below Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.printf("Average Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
    }
}