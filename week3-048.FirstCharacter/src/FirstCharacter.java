import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String lala=reader.nextLine();
        System.out.println("First character: "+firstCharacter(lala));
        
       
    }
    public static char firstCharacter(String lala){
        return lala.charAt(0);
    }
}
