
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int j = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i<=j){
            System.out.println(i);
            i++;
        }
    }
}
