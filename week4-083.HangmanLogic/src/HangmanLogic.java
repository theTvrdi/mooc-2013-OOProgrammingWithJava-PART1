
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (this.guessedLetters.contains(letter)) {
            return;
        } else {
            if (this.word.contains(letter)) {
                this.guessedLetters += letter;
            } else {
                this.guessedLetters += letter;
                this.numberOfFaults++;
            }
        }

    }

    public String hiddenWord() {
        int i = 0;
        String hW = "";
        while (i < this.word.length()) {
            if (this.guessedLetters.contains(String.valueOf(this.word.charAt(i)))) {
                hW += this.word.charAt(i);
            } else {
                hW += "_";
            }
            i++;
        }
        return hW;
    }
}

// program here the functionality for building the hidden word
// create the hidden word by iterating through this.word letter by letter
// if the letter in turn is within the guessed words, put it in the hidden word
// if the letter is not among the guessed ones, replace it with _ in the hidden word
// return the hidden word at the end

