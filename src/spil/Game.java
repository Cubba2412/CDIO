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

        //System.out.println();

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
           // int dice1Value = generateRandomDiceValue();
           // int dice2Value = generateRandomDiceValue();
            //Creating two dice
            raflecup.rafleCup();
            //Throwing the dice

            int[] diceResult = raflecup.throwDice();
            System.out.println("Dice1 value: " + diceResult[0]);
            System.out.println("Dice2 value: " + diceResult[1]);
                        var diceCombinedValue = diceResult[0] + diceResult[1];
                        if ((diceCombinedValue == 12) && (!currentPlayer.getTwoSixes())) {
                            currentPlayer.setTwoSixes(); //Set twoSixes high
                        }
            currentPlayer.updatePoints(diceCombinedValue);
            System.out.println(currentPlayer.getName() + " total points: " + currentPlayer.getPoints());


            if(Rules.win(diceResult[0],diceResult[1],currentPlayer)){
                System.out.println(currentPlayer.getName() + " has won the game! :)");
                System.out.println("GAME OVER");
                gameIsRunning = false;
                return; //exit the method
            }

            if(!Rules.extraTurn(diceResult[0], diceResult[1])) {
                if (currentPlayer == player1) {
                    if(currentPlayer.getTwoSixes()) {
                        currentPlayer.setTwoSixes(); //Set twoSixes low
                    }
                    currentPlayer = player2;
                } else {
                    if(currentPlayer.getTwoSixes()) {
                        currentPlayer.setTwoSixes(); //Set twoSixes low
                    }
                    currentPlayer = player1;
                }
            }
            System.out.println("--------------------------------");
            System.out.println();

        }
    }

   /* private int generateRandomDiceValue(){
        int diceMinimumValue = 1;
        int diceMaximumValue = 6;
        return diceMinimumValue + random.nextInt((diceMaximumValue - diceMinimumValue) + 1);
    }*/

}

