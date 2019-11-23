
import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    private ArrayList<Integer> lista = new ArrayList<Integer>();
    private Scanner reader;
    private int[] distr = {0, 0, 0, 0, 0, 0};
    private int sum;

    public Grades(Scanner reader) {
        this.reader = reader;
        this.sum = 0;
    }

    public void Input() {
        System.out.println("Type exam scores, -1 completes:");
        int i = 0;
        while (i != -1) {
            i = reader.nextInt();
            lista.add(i);
        }
    }

    public void MakeDistr() {
        for (int prvi : lista) {
            if (prvi >= 0 && prvi < 30) {
                distr[0]++;
            }
            if (prvi >= 30 && prvi <= 34) {
                distr[1]++;
            } else if (prvi >= 35 && prvi <= 39) {
                distr[2]++;
            } else if (prvi >= 40 && prvi <= 44) {
                distr[3]++;
            } else if (prvi >= 45 && prvi <= 49) {
                distr[4]++;
            } else if (prvi >= 50 && prvi <= 60) {
                distr[5]++;
            }
            if (prvi >= 0 && prvi <= 60) {
                sum++;
            }
        }
    }

    public void PrintDistr() {
        System.out.println("Grade distribution: ");
        for (int i = 0; i < distr.length; i++) {
            System.out.print(distr.length - 1 - i + ": ");
            for (int j = 0; j < distr[distr.length - 1 - i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        if(sum==0) System.out.println("Acceptance percentage: 0.0");
        else System.out.println("Acceptance percentage: " + (double) (100 * (sum - distr[0]) / sum));
    }

}
