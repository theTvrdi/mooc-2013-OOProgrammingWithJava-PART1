import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Grades ocjene = new Grades(lukija);
        ocjene.Input();
        ocjene.MakeDistr();
        ocjene.PrintDistr();
    }
}
