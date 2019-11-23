
import java.util.Random;

public class PasswordRandomizer {

    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String pw = "";
        Random rnd = new Random();
        for (int i = 0; i < this.length; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(rnd.nextInt("abcdefghijklmnopqrstuvwxyz".length()));
            pw += symbol;
        }
        return pw;
    }
}