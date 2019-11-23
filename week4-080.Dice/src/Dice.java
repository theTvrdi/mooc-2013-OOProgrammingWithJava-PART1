import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides=numberOfSides;
        random = new Random();
    }

    public int roll() {
        return (int)(Math.random()*((this.numberOfSides-1)+1))+1;
    }
}