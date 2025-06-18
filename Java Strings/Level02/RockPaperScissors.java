import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many games would you like to play? ");
        int games = scanner.nextInt();
        
        if (games <= 0) {
            System.out.println("Please enter a positive number of games.");
            return;
        }
        
        String[][] gameResults = new String[games][3];
        int userWins = 0;
        int computerWins = 0;
        
        for (int i = 0; i < games; i++) {
            System.out.println("\nGame " + (i+1) + ":");
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.next().toLowerCase();
            
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
                i--; 
                continue;
            }
            
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
            
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + winner + " wins!");
        }
        
        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(gameResults, stats);
    }
    
    public static String getComputerChoice() {
        int random = (int)(Math.random() * 3);
        
        switch (random) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock";
        }
    }
    
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        }
        
        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        int ties = totalGames - userWins - computerWins;
        double userWinPercent = (userWins * 100.0) / totalGames;
        double computerWinPercent = (computerWins * 100.0) / totalGames;
        double tiePercent = (ties * 100.0) / totalGames;
        
        String[][] stats = new String[3][3];
        
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userWinPercent);
        
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerWinPercent);
        
        stats[2][0] = "Ties";
        stats[2][1] = String.valueOf(ties);
        stats[2][2] = String.format("%.2f%%", tiePercent);
        
        return stats;
    }
    
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\n--- Game Results ---");
        System.out.println("Game\tUser\t\tComputer\tWinner");
        
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t\t" +  gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }
        
        System.out.println("\n--- Statistics ---");
        System.out.println("Player\t\tWins\tPercentage");
        
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t\t" + stat[1] + "\t" + stat[2]);
        }
    }
}