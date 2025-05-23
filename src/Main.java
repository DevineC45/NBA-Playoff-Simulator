import java.text.DecimalFormat;

/****
 ***** Created by Conor on 23/05/2025
 ***** The main class - will call my methods to actually run the simulation
 ****/
public class Main {
    static DecimalFormat df = new DecimalFormat("00.00");

    public static void main(String[] args) {
        Team team1 = new Team();
        team1.teamName = "Minnesota Timberwolves";
        team1.wins = 49.0;
        team1.winPercent = Team.calculateWLPercentage(team1.wins);
        System.out.println(df.format(team1.winPercent));

        Team team2 = new Team();
        team2.teamName = "Denver Nuggets";
        team2.wins = 50.0;
        team2.winPercent = Team.calculateWLPercentage(team2.wins);

        Team team3 = new Team();
        team3.teamName = "Oklahoma City Thunder";
        team3.wins = 68.0;
        team3.winPercent = Team.calculateWLPercentage(team3.wins);

        Team team4 = new Team();
        team4.teamName = "Golden State Warriors";
        team4.wins = 48.0;
        team4.winPercent = Team.calculateWLPercentage(team4.wins);

        Team team5 = new Team();
        team5.teamName = "Los Angeles Lakers";
        team5.wins = 50.0;
        team5.winPercent = Team.calculateWLPercentage(team5.wins);

        Team team6 = new Team();
        team6.teamName = "Los Angeles Clippers";
        team6.wins = 50.0;
        team6.winPercent = Team.calculateWLPercentage(team6.wins);

        Team team7 = new Team();
        team7.teamName = "Houston Rockets";
        team7.wins = 52.0;
        team7.winPercent = Team.calculateWLPercentage(team7.wins);

        Team team8 = new Team();
        team8.teamName = "Memphis Grizzlies";
        team8.wins = 48.0;
        team8.winPercent = Team.calculateWLPercentage(team8.wins);

        Team team9 = new Team();
        team9.teamName = "Cleveland Cavaliers";
        team9.wins = 64.0;
        team9.winPercent = Team.calculateWLPercentage(team9.wins);

        Team team10 = new Team();
        team10.teamName = "Boston Celtics";
        team10.wins = 61.0;
        team10.winPercent = Team.calculateWLPercentage(team10.wins);

        Team team11 = new Team();
        team11.teamName = "New York Knicks";
        team11.wins = 51.0;
        team11.winPercent = Team.calculateWLPercentage(team11.wins);

        Team team12 = new Team();
        team12.teamName = "Indiana Pacers";
        team12.wins = 50.0;
        team12.winPercent = Team.calculateWLPercentage(team12.wins);

        Team team13 = new Team();
        team13.teamName = "Milwaukee Bucks";
        team13.wins = 48.0;
        team13.winPercent = Team.calculateWLPercentage(team13.wins);

        Team team14 = new Team();
        team14.teamName = "Detroit Pistons";
        team14.wins = 44.0;
        team14.winPercent = Team.calculateWLPercentage(team14.wins);

        Team team15 = new Team();
        team15.teamName = "Orlando Magic";
        team15.wins = 41.0;
        team15.winPercent = Team.calculateWLPercentage(team15.wins);

        Team team16 = new Team();
        team16.teamName = "Miami Heat";
        team16.wins = 37.0;
        team16.winPercent = Team.calculateWLPercentage(team16.wins);
    }//main
}//class