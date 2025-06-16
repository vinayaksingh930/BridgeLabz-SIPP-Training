import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        if (numStudents <= 0) {
            System.out.println("Invalid input! Number of students must be positive.");
            return;
        }
        
        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            while (true) {
                System.out.print("Enter marks in Physics (0-100): ");
                marks[i][0] = scanner.nextDouble();
                
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid marks! Marks should be between 0 and 100.");
                } else {
                    break;
                }
            }
            
            while (true) {
                System.out.print("Enter marks in Chemistry (0-100): ");
                marks[i][1] = scanner.nextDouble();
                
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid marks! Marks should be between 0 and 100.");
                } else {
                    break;
                }
            }
            
            while (true) {
                System.out.print("Enter marks in Mathematics (0-100): ");
                marks[i][2] = scanner.nextDouble();
                
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid marks! Marks should be between 0 and 100.");
                } else {
                    break;
                }
            }
            
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Mathematics: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }
        
    }
}