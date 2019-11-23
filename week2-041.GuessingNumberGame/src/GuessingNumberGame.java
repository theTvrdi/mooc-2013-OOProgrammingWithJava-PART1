
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess=-1;
        int i = 0;
        while(guess!=numberDrawn){
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            i++;
            if(guess>numberDrawn) System.out.println("The number is lesser, guesses made: "+i+"\n");
            else if (guess<numberDrawn) System.out.println("The number is greater, guesses made: "+i+"\n");
            else System.out.println("Congratulations, your guess is correct!");
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
