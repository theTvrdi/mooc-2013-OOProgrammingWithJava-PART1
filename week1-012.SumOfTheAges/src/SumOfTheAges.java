
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String prviIme = reader.nextLine();
        System.out.println("Type your age: ");
        int prviGod = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String drugiIme = reader.nextLine();
        System.out.println("Type your age: ");
        int drugiGod = Integer.parseInt(reader.nextLine());
        
        System.out.println(prviIme +" and " +drugiIme+ " are " +(prviGod+drugiGod)+ " years old in total.");
        // Implement your program here
    }
}
