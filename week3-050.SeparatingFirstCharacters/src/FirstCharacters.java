import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String lala=reader.nextLine();
        if (lala.length()>=3)
        {
            System.out.println("1. character: "+lala.charAt(0));
            System.out.println("2. character: "+lala.charAt(1));
            System.out.println("3. character: "+lala.charAt(2));
        }
    }
}
