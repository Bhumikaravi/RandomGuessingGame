public class Check {
    private int secretNumber;

    public Check(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public String checkGuess(int guess) {
        if (guess < secretNumber) {
            return "That was too lowwwwww.Try again.";
        } else if (guess > secretNumber) {
            return "Too high.Try Once again.";
        } else {
            return "Wowwww!You guessed the correct number.";
        }
    }
}