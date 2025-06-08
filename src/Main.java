import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
/****
 ***** Created by Conor on 08/06/2025
 ***** This class runs the full simulation and prints the results
 ****/
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.00");

        //Create conferences
        List<Team> westernConference = createWesternConference();
        List<Team> easternConference = createEasternConference();

        System.out.println("Western Conference Standings\n-------------------");
        for (Team team : westernConference) {
            System.out.println(team.teamName + " - " + df.format(team.winPercent) + "%");
        }

        System.out.println("\nEastern Conference Standings\n-------------------");
        for (Team team : easternConference) {
            System.out.println(team.teamName + " - " + df.format(team.winPercent) + "%");
        }

        System.out.println("\n============ Playoffs ===============\n");

        System.out.println("======= Western Conference =======\n-------------");
        Team westChampion = PostSeason.simulateConference(westernConference);

        System.out.println("\n======= Eastern Conference =======\n-------------");
        Team eastChampion = PostSeason.simulateConference(easternConference);

        System.out.println("\n======== NBA Finals ========\n-----------------");
        Team NBAChampions = PostSeason.simSeries(westChampion, eastChampion);

        System.out.println("\nThe " + (NBAChampions.teamName) + " are your NBA Champions");
    }//main


    public static List<Team> createWesternConference(){
        List <Team> westernConference = new ArrayList<>();
        westernConference.add(new Team("Minnesota Timberwolves", 49));
        westernConference.add(new Team("Los Angeles Lakers", 50));
        westernConference.add(new Team("Los Angeles Clippers", 50));
        westernConference.add(new Team("Memphis Grizzlies", 48));
        westernConference.add(new Team("Houston Rockets", 52));
        westernConference.add(new Team("Golden State Warriors", 48));
        westernConference.add(new Team("Denver Nuggets", 50));
        westernConference.add(new Team("Oklahoma City Thunder", 68));

        westernConference.sort((a, b) -> Double.compare(b.winPercent, a.winPercent));

        return westernConference;
    }

    public static List<Team> createEasternConference(){
        List <Team> easternConference = new ArrayList<>();
        easternConference.add(new Team("Miami Heat", 37));
        easternConference.add(new Team("Boston Celtics", 61));
        easternConference.add(new Team("Orlando Magic", 41));
        easternConference.add(new Team("Detroit Pistons", 44));
        easternConference.add(new Team("Cleveland Cavaliers", 64));
        easternConference.add(new Team("Milwaukee Bucks", 48));
        easternConference.add(new Team("New York Knicks", 51));
        easternConference.add(new Team("Indiana Pacers", 50));

        easternConference.sort((a, b) -> Double.compare(b.winPercent, a.winPercent));

        return easternConference;
    }
}//class
