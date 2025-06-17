import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int handshakes = calculateHandshakes(numberOfStudents);
        
        System.out.println("Maximum number of possible handshakes among " +  numberOfStudents + " students: " + handshakes);       
    }
    
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}