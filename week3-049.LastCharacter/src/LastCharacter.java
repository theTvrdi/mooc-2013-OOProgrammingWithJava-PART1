import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String lala=reader.nextLine();
        System.out.println("Last character: "+lastCharacter(lala));
        
       
    }
    public static char lastCharacter(String lala){
        return lala.charAt(lala.length()-1);
    }
}
