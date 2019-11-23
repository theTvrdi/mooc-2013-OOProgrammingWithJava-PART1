
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int prvi = Integer.parseInt(reader.nextLine());
        if (prvi>0) // Type your program here:
        {
            System.out.println("The number is positive.");
        }
        else
        {System.out.println("The number is not positive.");}
    }
}
