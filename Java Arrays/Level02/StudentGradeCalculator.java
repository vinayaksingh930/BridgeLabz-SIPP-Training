import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        if (numStudents <= 0) {
            System.out.println("Invalid input! Number of students must be positive.");
            return;
        }
        
        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            while (true) {
                System.out.print("Enter marks in Physics (0-100): ");
                physicsMarks[i] = scanner.nextDouble();
                
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Invalid marks! Marks should be between 0 and 100.");
                } else {
                    break;
                }
            }
            
            while (true) {
                System.out.print("Enter marks in Chemistry (0-100): ");
                chemistryMarks[i] = scanner.nextDouble();
                
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Invalid marks! Marks should be between 0 and 100.");
                } else {
                    break;
                }
            }
            
            while (true) {
                System.out.print("Enter marks in Mathematics (0-100): ");
                mathsMarks[i] = scanner.nextDouble();
                
                if (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                    System.out.println("Invalid marks! Marks should be between 0 and 100.");
                } else {
                    break;
                }
            }
            
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;
            
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        
        System.out.println("\n--- Student Results ---");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Mathematics: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }
        
    }
}