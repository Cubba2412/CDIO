package spil;

import Player.Player;

public class Rules {

    static Player checkRules(int Dice1, int Dice2, Player Player) {
        Player = twoOnes(Dice1,Dice2,Player);
        //Player = extraTurn(Dice1,Dice2,Player);
        Player = win(Dice1,Dice2,Player);
        return Player;
    }

    static Player twoOnes(int Dice1, int Dice2, Player Player) {
        if ((Dice1 == 1 && Dice2 == 1)) {
            //Player looses all points
            Player.resetPoints();
        }
        return Player;
    }

    static boolean extraTurn(int Dice1, int Dice2, Player Player) {
        if (Dice1 == Dice2) {
            return true;
        }

        return false;
    }


    static boolean win(int Dice1, int Dice2, Player Player) {
        if (Player.points >= 40) {
            if (Dice1 == Dice2) {
                return true;
            } else if ((Player.previousPoints == 12) && (Dice1 == 6) && (Dice2 == 6)) {
                return true;
            } else {
                return false;
            }
        }
    }
