
import java.util.Scanner;

public class _19_Rock_Paper_Scissors {
    static String getComputerChoice() {
        int r = (int)(Math.random() * 3);
        return switch (r) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return "user";
        else
            return "computer";
    }

    static void displayStats(int userWin, int compWin, int totalGames) {
        double userPct = (userWin * 100.0) / totalGames;
        double compPct = (compWin * 100.0) / totalGames;
        System.out.println("User Wins: " + userWin + ", " + userPct + "%");
        System.out.println("Computer Wins: " + compWin + ", " + compPct + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWin = 0, compWin = 0;
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);
            System.out.println("Computer chose: " + comp);
            if (winner.equals("user")) userWin++;
            else if (winner.equals("computer")) compWin++;
        }

        displayStats(userWin, compWin, games);
    }
}
