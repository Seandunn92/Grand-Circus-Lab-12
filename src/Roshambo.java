/**
 * Created by seandunn92 on 4/21/17.
 */
public enum Roshambo {
    Rock, Paper, Scissors;

    @Override
    public String toString() {
        switch (this) {
            case Rock:
                return "Rock";
            case Paper:
                return "Paper";
            case Scissors: return "Scissors";
            default: return "Error";
        }
    }
}