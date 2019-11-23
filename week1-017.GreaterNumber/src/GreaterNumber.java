
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
System.out.println("Type the first number: ");
        int prvi = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int drugi = Integer.parseInt(reader.nextLine());
        if (prvi>drugi){
            System.out.println("Greater number; "+prvi);
        }
        else if (prvi==drugi){
            System.out.println("The numbers are equal!");
        }
        else{   
            System.out.println("Greater number; "+drugi);
        }
    }
}