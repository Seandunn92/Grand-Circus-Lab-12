/**
 * Created by seandunn92 on 4/21/17.
 */
import java.util.Scanner;

public class Lab12Driver {
    public  static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        HumanPlayer human = new HumanPlayer("Sean");
        ComputerPlayer computer = new ComputerPlayer("Computer");
        RockPlayer rock = new RockPlayer("Rock Playar");
        Player currPlayer = null;
        int userInt =-1;
        char userChar = 'g';
        Roshambo ourRosh;
        Roshambo oppRosh;


        System.out.println("Welcome to the Rock Paper Scissors game");

        do{
            System.out.println("Enter 1 to play against a Computer, any other number to play against Rock Player");
            userInt = scan.nextInt();
            scan.nextLine();
            if (userInt==1)
                currPlayer = computer;
            else
                currPlayer = rock;

            System.out.println("You chose "+ currPlayer.getName());
            ourRosh = human.generateRoshamboValue();
            oppRosh = currPlayer.generateRoshamboValue();
            generateWinner(ourRosh, oppRosh);


            System.out.println("Would you like to continue (y/n)");
            userChar = scan.nextLine().toLowerCase().charAt(0);

        }while (userChar=='y');


    }

    private static void generateWinner(Roshambo ourRosh, Roshambo oppRosh) {
        if (ourRosh==Roshambo.Rock && oppRosh==Roshambo.Scissors || ourRosh==Roshambo.Scissors && oppRosh == Roshambo.Paper
                ||ourRosh==Roshambo.Paper && oppRosh==Roshambo.Rock){
            System.out.println("You won! Opponent chose " + oppRosh);
        }
        else if (ourRosh == oppRosh){
            System.out.println("You tied. Opponent chose " + oppRosh);
        }
        else{
            System.out.println("You lost. Opponent chose " +oppRosh );
        }
    }

}
