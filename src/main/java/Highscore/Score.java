package Highscore;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.println("Score for Sheetz My Wife ");
        int teamscore1 = sc.nextInt();
        System.out.println("Score for Wawa Venus");
        int teamscore2 = sc.nextInt();

        String input = ("Sheetz My Wife:Wawa Venus|" + teamscore1 + ":" + teamscore2);
        String[] splitInput = input.split(Pattern.quote( "|"));
        String[] splitScores = splitInput[1].split(Pattern.quote(":"));

        int finalScore1 = Integer.parseInt(splitScores[0]);
        int finalScore2 = Integer.parseInt(splitScores[1]);

        System.out.println(input);


        if (finalScore1 > finalScore2) {
            System.out.println("Give it up for Sheetz My Wife!");
        }
        else {
            System.out.print("Give it up for Wawa Venus!");

        }












    }
}
