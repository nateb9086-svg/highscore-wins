package Highscore;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.println("Score for Sheets My Wife ");
        int teamscore1 = sc.nextInt();
        System.out.println("Score for Wawa Venus");
        int teamscore2 = sc.nextInt();

        String input = ("Sheets My Wife:Wawa Venus|" + teamscore1 + ":" + teamscore2);
        String[] splitInput = input.split(Pattern.quote( "|"));
        String scores = splitInput[1];
        String[] splitScores = splitInput[1].split(Pattern.quote(":"));

        int finalscore1 = Integer.parseInt(splitScores[0]);
        int finalscore2 = Integer.parseInt(splitScores[1]);












    }
}
