
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DB db = new DB(lukija);
        db.Menu();

    }

}
