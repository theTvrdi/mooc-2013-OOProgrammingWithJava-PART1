import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String lala = reader.nextLine();
        System.out.print("In reverse order: ");
        int i = lala.length()-1;
        while(i>=0){
            System.out.print(lala.charAt(i));
            i--;
    }
}

}