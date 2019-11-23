import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int i = 0;
        int sum = 1;
        int j=-1;
        int evens = 0;
        int odds = -1;
        do {
            i = Integer.parseInt(reader.nextLine());
            if (i%2==0){
                evens++;
            }
            else odds ++;
            sum += i;
            j++;
        } while (i!=-1);
        System.out.print("Thank you and see you later! \nThe sum is: "+sum+"\nHow many numbers: "+j+"\nAverage: "+(double)sum/j);
        System.out.println("\nOdd numbers: "+odds+"\nEven numbers: "+evens);
    }
}
