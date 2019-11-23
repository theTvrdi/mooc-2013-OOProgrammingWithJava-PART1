
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        int a;
        while(this.numbers.size()<7){
            a = (int)(Math.random() * ((39)) + 1);
            if (!this.containsNumber(a)) {
                this.numbers.add(a);
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
