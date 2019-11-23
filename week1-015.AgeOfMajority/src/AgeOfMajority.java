
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        int prvi = Integer.parseInt(reader.nextLine());
        if (prvi>=18) // Type your program here:
        {
            System.out.println("You have reached the age of majority!");
        }
        else
        {System.out.println("You have not reached the age of majority yet!");}
        // Type your program here 
    }
}
