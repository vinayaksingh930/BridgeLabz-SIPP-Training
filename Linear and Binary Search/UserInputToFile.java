import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            System.out.println("Enter text (type 'exit' to stop):");
            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(input);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}