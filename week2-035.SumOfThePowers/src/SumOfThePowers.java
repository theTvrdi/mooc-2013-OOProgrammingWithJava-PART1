
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.next());
        int i = 0;
        int c = 0;
        if (a == 0) {
            System.out.println("The result is 1");
        } else {
            while (i <= a) {
                c += (int) Math.pow(2, i);
                i++;
            }
            System.out.println("The result is " + c);
        }
    }
}
