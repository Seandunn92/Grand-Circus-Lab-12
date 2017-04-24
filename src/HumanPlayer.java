/**
 * Created by seandunn92 on 4/21/17.
 */
import java.util.Scanner;
public class HumanPlayer extends Player {



    public HumanPlayer(String name){
        this.name = name;
        roshValue = Roshambo.Scissors;
    }

    @Override
    Roshambo generateRoshamboValue() {
        System.out.println("Please enter Rock, Paper, or Scissors");
        String userInput = Lab12Driver.scan.nextLine();
        roshValue = Roshambo.valueOf(userInput);
        return roshValue;
    }




//    public choice getChoice() {
//      Scanner humanScan = new Scanner(System.in);
//       int playerInt = humanScan.nextInt();
//        if(playerInt==1)
//            return choice.Rock;
//       if (playerInt ==2)
//            return choice.Paper;
//       return choice.Scissors;
  //  }
//    public choice makeChoice (int playerInt){
//        if(playerInt==1)
//            return choice.Rock;
//        if (playerInt ==2)
//            return choice.Paper;
//        return choice.Scissors;
//    }
}
