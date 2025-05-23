import java.util.Scanner;
/****
 ***** Created by Conor on 23/05/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/

public class Team {
    String teamName;
    double wins;
    double winPercent;

    //This method will return a team's regular season winning percentage
    public static double calculateWLPercentage(double wins){
        return (wins/82) * 100;
    }//method




}//class
