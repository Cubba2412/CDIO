package spil;
import java.util.Scanner;
class Input {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner scanner = new Scanner(System.in);
    public void start() {

        System.out.println("Enter player1 name:");
        String player1Name = scanner.nextLine();
        player1 = new Player(player1Name);

        System.out.println("Enter player2 name:");
        String player2Name = scanner.nextLine();
        player2 = new Player(player2Name);

        System.out.println();

        currentPlayer = player1;
    }
}


