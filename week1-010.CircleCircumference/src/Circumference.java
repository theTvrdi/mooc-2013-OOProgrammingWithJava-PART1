
import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int prvi = Integer.parseInt(reader.nextLine());
        System.out.println("Circumference of the circle:" +(prvi*Math.PI*2));
        // Program your solution here 
    }
}
