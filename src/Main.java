import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/****
 ***** Created by Conor on 23/05/2025
 ***** The main class - will call my methods to actually run the simulation
 ****/
public class Main {
    static DecimalFormat df = new DecimalFormat("00.00");

    public static void main(String[] args) {
        Team team1 = new Team("Minnesota Timberwolves", 49.0);
        team1.winPercent = Team.calculateWLPercentage(team1.wins);

        Team team2 = new Team("Denver Nuggets", 50.0);
        team2.winPercent = Team.calculateWLPercentage(team2.wins);

        Team team3 = new Team("Oklahoma City Thunder", 68.0);
        team3.winPercent = Team.calculateWLPercentage(team3.wins);

        Team team4 = new Team("Golden State Warriors", 48.0);
        team4.winPercent = Team.calculateWLPercentage(team4.wins);

        Team team5 = new Team("Los Angeles Lakers", 50.0);
        team5.winPercent = Team.calculateWLPercentage(team5.wins);

        Team team6 = new Team("Los Angeles Clippers", 50.0);
        team6.winPercent = Team.calculateWLPercentage(team6.wins);

        Team team7 = new Team("Houston Rockets",52.0 );
        team7.winPercent = Team.calculateWLPercentage(team7.wins);

        Team team8 = new Team("Memphis Grizzlies", 48.0);
        team8.winPercent = Team.calculateWLPercentage(team8.wins);

        Team team9 = new Team("Cleveland Cavaliers", 64.0);
        team9.winPercent = Team.calculateWLPercentage(team9.wins);

        Team team10 = new Team("Boston Celtics", 61.0);
        team10.winPercent = Team.calculateWLPercentage(team10.wins);

        Team team11 = new Team("New York Knicks", 51.0);

        team11.winPercent = Team.calculateWLPercentage(team11.wins);

        Team team12 = new Team("Indiana Pacers", 50.0);
        team12.winPercent = Team.calculateWLPercentage(team12.wins);

        Team team13 = new Team("Milwaukee Bucks", 48.0);
        team13.winPercent = Team.calculateWLPercentage(team13.wins);

        Team team14 = new Team("Detroit Pistons", 44.0);
        team14.winPercent = Team.calculateWLPercentage(team14.wins);

        Team team15 = new Team("Orlando Magic", 41.0);
        team15.winPercent = Team.calculateWLPercentage(team15.wins);

        Team team16 = new Team("Miami Heat",37.0);
        team16.winPercent = Team.calculateWLPercentage(team16.wins);

        List<Team> westernConference = new ArrayList<>();
        List<Team> easternConference = new ArrayList<>();

        westernConference.add(team1);
        westernConference.add(team2);
        westernConference.add(team3);
        westernConference.add(team4);
        westernConference.add(team5);
        westernConference.add(team6);
        westernConference.add(team7);
        westernConference.add(team8);
        //Sort the array list in descending order of win percentage
        westernConference.sort((a, b) -> Double.compare(b.winPercent, a.winPercent));


        easternConference.add(team9);
        easternConference.add(team10);
        easternConference.add(team11);
        easternConference.add(team12);
        easternConference.add(team13);
        easternConference.add(team14);
        easternConference.add(team15);
        easternConference.add(team16);
        //Sort the array list in descending order of win percentage
        easternConference.sort((a, b) -> Double.compare (b.winPercent, a.winPercent));

        System.out.println("Western Conference Standings\n-------------------");
        for (Team team : westernConference) {
            System.out.println(team.teamName + " - " + df.format(team.winPercent) + "%");
        }

        System.out.println("\nEastern Conference Standings\n-------------------");
        for (Team team : easternConference) {
            System.out.println(team.teamName + " - " + df.format(team.winPercent) + "%");
        }





    }//main
}//class