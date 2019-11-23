
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String lala = reader.nextLine();
        int i = 0;
                while(i<lala.length()){
                    System.out.println(i+1+". character: "+lala.charAt(i));
            i++;
        }
    }
}
