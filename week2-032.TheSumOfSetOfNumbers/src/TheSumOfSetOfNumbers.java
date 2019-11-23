
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        System.out.println("Until what: ");
        int j = Integer.parseInt(reader.nextLine());
        int sum=0;
        while(i<=j){
            sum+=i;
            i++;
            
        }
        System.out.println("Sum is " +sum);
    }
}
