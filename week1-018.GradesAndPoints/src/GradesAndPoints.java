
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
System.out.println("Type the points [0-60]: ");
        int prvi = Integer.parseInt(reader.nextLine());
        if (prvi>=0 && prvi <=29){
            System.out.println("Failed");
        }
        else if (prvi>=30 && prvi <=34){
            System.out.println("Grade: 1");
        }
        else if (prvi>=35 && prvi <=39){
            System.out.println("Grade: 2");
        }
        else if (prvi>=40 && prvi <=44){
            System.out.println("Grade: 3");
        }
        else if (prvi>=45 && prvi <=49){
            System.out.println("Grade: 4");
        }
        else if (prvi>=50 && prvi <=60){
            System.out.println("Grade: 5");
        }
    }
}