package spil;

import Player;

public class Rules {

    static Player checkRules(int Dice1, int Dice2, Player Player) {
        Player = twoOnes(Dice1,Dice2,Player);
        Player = extraTurn(Dice1,Dice2,Player);
        Player = win(Dice1,Dice2,Player);
        return Player;
    }

    static Player twoOnes(int Dice1, int Dice2, Player Player) {
        if ((Dice1 == 1 && Dice2 == 1)) {
            //Player looses all points
            Player.points == 0;
        }
        return Player;
    }

    static Player extraTurn(int Dice1, int Dice2, Player Player) {
        if (Dice1 == Dice2) {
            Player.turn = true;
        }

        return Player;
    }


    static Player win(int Dice1, int Dice2, Player Player) {
        if (Player.points >= 40) {
            if (Dice1 == Dice2) {
                Player.win = true;
            }
        }
        else if ((Player.previousPoints == 12) && (Dice1 == 6) && (Dice2 == 6)) {
            Player.win = true;
        }
        else {
            Player.win = false;
        }
        return Player;
    }
}
