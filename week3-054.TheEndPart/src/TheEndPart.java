import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.println("Type a word: ");
        String ime=reader.nextLine();
        System.out.println("Length of the last part: ");
        int broj=Integer.parseInt(reader.nextLine());
        System.out.println("Result: "+ime.substring(ime.length()-broj));
    }
}