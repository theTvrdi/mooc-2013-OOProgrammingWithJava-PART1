
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("Type a number: ");
            int prvi = Integer.parseInt(reader.nextLine());
            System.out.println("Type another number: ");
            int drugi = Integer.parseInt(reader.nextLine());
            System.out.println("Sum of the numbers: " +(prvi+drugi));
        // Implement your program here. Remember to ask the input from user
    }
}
 
