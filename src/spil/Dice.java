package spil ;

import java.util.Random;

class Dice  {

    public static void main (String... args) {
        Random ran = new Random();
        int dice1, dice2;

        for(int x=0;x<1;x++);
        dice1 = ran.nextInt(6)+1;
        dice2= ran.nextInt(6)+1;
        System.out.println(dice1+dice2);
    }
}