
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String prva=reader.nextLine();
        System.out.println("Type the second word: ");
        String druga=reader.nextLine();
        if (prva.contains(druga))  System.out.println("The word '"+druga+"' is found in the word '"+prva+"'.");
        else System.out.println("The word '"+druga+"' is not found in the word '"+prva+"'.");
    }
}