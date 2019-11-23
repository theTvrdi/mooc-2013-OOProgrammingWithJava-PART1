
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String lala=reader.nextLine();
        System.out.println("Number of characters: "+calculateCharacters(lala));
    }
    public static int calculateCharacters(String lala){
            return lala.length();
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
