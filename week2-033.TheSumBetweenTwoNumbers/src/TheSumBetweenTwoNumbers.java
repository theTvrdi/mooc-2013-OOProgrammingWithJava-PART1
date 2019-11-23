
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int i = Integer.parseInt(reader.nextLine());
        System.out.println("First: ");
        int j = Integer.parseInt(reader.nextLine());
        int sum=0;
        while(i<=j){
            sum+=i;
            i++;
            
        }
        System.out.println("Sum is " +sum);
    }
}
