
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String ime=reader.nextLine();
        System.out.println("Length of the first part: ");
        int broj=Integer.parseInt(reader.nextLine());
        System.out.println("Result: "+ime.substring(0,broj));
    }
}