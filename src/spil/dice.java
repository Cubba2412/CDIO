package spil;

public class dice {
    int antalSider, currentValue;
    public void throwDice()
    {
        currentValue = ( (int)Math.random()*6)+ 1;
    }

}
