package spil;

public class Rules {

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
        if (Player.getPoints() >= 40) {
            if (Dice1 == Dice2) {
                return true;
            }
        } else if ((Player.getTwoSixes()) && (Dice1 == 6) && (Dice2 == 6)) {
            return true;
        }
        return false;
    }
}

