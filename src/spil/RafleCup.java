package spil;

public class RafleCup
{
    Game game = new Game();
    public static   Dice Dice1;
    private  static Dice Dice2;
    public static int ValueOfDice1, ValueOfDice2;
    //Constructor, this is what the raflecup contains which is two dice
    public void rafleCup()
    {
     //Creating the first dice
     Dice1 = new Dice();
     //Creating second dice
     Dice2 = new Dice();
    }

    //Throws first and second dice simultaneously
    public int[] throwDice()
    {
     //Throwing the first dice
     ValueOfDice1 = Dice1.roll();
     //Throwing secod dice
     ValueOfDice2 = Dice2.roll();
     return new int[]{ValueOfDice1, ValueOfDice2};
    }


}

