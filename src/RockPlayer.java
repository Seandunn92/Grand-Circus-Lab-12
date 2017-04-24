/**
 * Created by seandunn92 on 4/23/17.
 */
public class RockPlayer extends Player {

public RockPlayer(String name){
    roshValue = Roshambo.Rock;
    this.name=name;
}

    @Override
    Roshambo generateRoshamboValue() {
        return roshValue;
    }
}
