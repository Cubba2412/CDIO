package spil ;

import java.util.Random;

public class Dice
{
    final int MinValue = 1;
    final int MaxValue = 6;
          int Currentvalue;

  //This is the constructor for Dice.
  public Dice()
  {

  }

  public int roll()
  {
      Random ran = new Random();
      Currentvalue = ran.nextInt(MaxValue) + MinValue;
      //Returns the currentvalue
      return Currentvalue;
  }
}
