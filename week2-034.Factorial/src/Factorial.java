import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int i = Integer.parseInt(reader.nextLine());
        int j = 1;
        int sum = 1;
        if(i==0){
            System.out.println("Factorial is 1");
        }
        else{
            while(j<=i){
                sum*=j;
                j++;
            }
        }
        System.out.println("Factorial is " +sum);
    }
}
