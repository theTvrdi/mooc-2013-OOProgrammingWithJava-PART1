
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int god = Integer.parseInt(reader.nextLine());
        if (god%4==0) {
            if (god%100 == 0){
                if (god%400 == 0){
                    System.out.println("The year is a leap year.");
                }
                else System.out.println("The year is not a leap year.");
            }
            else System.out.println("The year is a leap year.");
        }
        else System.out.println("The year is not a leap year.");
    }
}
