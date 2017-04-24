/**
 * Created by seandunn92 on 4/23/17.
 */
public class ComputerPlayer extends Player {
    public ComputerPlayer(String name){
        this.name = name;
        roshValue = Roshambo.Paper;
    }

    @Override
    Roshambo generateRoshamboValue() {
        double randDouble = Math.random() *3;
        if(randDouble<1)
            roshValue = Roshambo.Rock;
        else if (randDouble<2)
            roshValue = Roshambo.Paper;
        else
            roshValue = Roshambo.Scissors;
        return roshValue;
    }
}
