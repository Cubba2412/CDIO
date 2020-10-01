package spil;

import java.util.Random;
import java.util.Scanner;
public class Game {

    private Player player1;
    private Player player2;
    private Player currentPlayer;


    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    RafleCup raflecup = new RafleCup();

    public void start(){

        System.out.println("Enter player1 name:");
        String player1Name = scanner.nextLine();
        player1 = new Player(player1Name);

        System.out.println("Enter player2 name:");
        String player2Name = scanner.nextLine();
        player2 = new Player(player2Name);

        //player1 starts the game
        currentPlayer = player1;

        startGame();
    }

    private void startGame(){
        //int winningPoints = 40;
        boolean gameIsRunning = true;
        while(gameIsRunning){

            System.out.println(currentPlayer.getName() + "'s turn. Throw dice (Enter)");
            String waitForDiceThrow = scanner.nextLine();

            //Creating two dice
            raflecup.rafleCup();
            //Throwing the dice
            int[] diceResult = raflecup.throwDice();
            //printing out the result
            System.out.println("Dice1 value: " + diceResult[0]);
            System.out.println("Dice2 value: " + diceResult[1]);a
            //Sum
            var diceCombinedValue = diceResult[0] + diceResult[1];
            currentPlayer.updatePoints(diceCombinedValue);
            System.out.println(currentPlayer.getName() + " total points: " + currentPlayer.getPoints());


            if(Rules.win(diceResult[0],diceResult[1],currentPlayer)){
                System.out.println(currentPlayer.getName() + " has won the game! :)");
                System.out.println("GAME OVER");
                gameIsRunning = false;
                return; //exit the method
            }
            if(!Rules.extraTurn(diceResult[0], diceResult[1],currentPlayer)) {
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
            }
            System.out.println("--------------------------------");
            System.out.println();

        }
    }
}