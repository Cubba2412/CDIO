package spil;

public class Player {

    //every player object will have a name and points (total points) fields.
    //they are kept private so they cannot be changed directly. they can be changed with public methods below
    private String name;
    private int points;
    private int winningPoints = 40;

    //constructor: we need player's name before we can create a player object
    //therefore we require a string as parameter and set tít to name field
    public Player(String playerName){
        name = playerName;
    }

// winningpoint = 42

    public String getName() {
        return name;
    }



    public int getPoints() {
        return points;
    }



    public void updatePoints(int newDiceCombinedValue) {
        points = points + newDiceCombinedValue;
    }

    public boolean hasPlayerWonTheGame(){
        return points >= winningPoints;
    }

}
