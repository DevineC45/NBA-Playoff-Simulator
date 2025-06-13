import java.util.List;
/****
 ***** Created by Conor on 23/05/2025
 ***** This will contain the logic for the simulation of a playoff series
 ****/
public class PostSeason {

    //This method is used to simulate a game between two teams
    public static Team simGame(List<Team> conference, Team teamA, Team teamB, boolean isTeamAHome){
        double homeAdvantageBoost = 1.05; //5% boost to the home team's strength

        double adjustedWinPercentA = teamA.winPercent;
        double adjustedWinPercentB = teamB.winPercent;

        if (isTeamAHome){
            adjustedWinPercentA *= homeAdvantageBoost;
        } else {
            adjustedWinPercentB *= homeAdvantageBoost;
        }

        double probabilityA = adjustedWinPercentA / (adjustedWinPercentA + adjustedWinPercentB);

        double winningProb = Math.random();

        if (winningProb <= probabilityA){
            return teamA;
        } else {
            return teamB;
        }
    }//simGame

    //This method is used to simulate a 7 game series - taking into account home court advantage
    public static Team simSeries (Team teamA, Team teamB){
        int teamAWins = 0;
        int teamBWins = 0;
        boolean [] homePattern = {true, true, false, false, true, false, true}; //Higher seeded team plays games 1, 2, 5 and 7 at home

        // Determine which team is the higher seed (by win %)
        boolean isTeamAHigherSeed = teamA.winPercent >= teamB.winPercent;


        System.out.println(teamA.teamName + "  vs  " + teamB.teamName);

        for (int i = 0; i < 7; i++){

            boolean isHomeForHigherSeed = homePattern[i];
            boolean isTeamAHome = (isTeamAHigherSeed == isHomeForHigherSeed);

            Team winner = simGame(null, teamA, teamB, isTeamAHome);

            if (winner == teamA){
                teamAWins++;
            } else {
                teamBWins++;
            }

            if (teamAWins == 4) {
                System.out.println(teamA.teamName + " win the series 4-" + teamBWins + "\n");
                return teamA;

            } else if (teamBWins == 4){
                System.out.println(teamB.teamName + " win the series 4-" + teamAWins + "\n");
                return teamB;
            }
        }//for
        throw new IllegalStateException("Series ended without a winner, which should be impossible.");
    }//simSeries

    //This method simulates a conference bracket taking an array list as a parameter
    //It will be called twice to give an Eastern Conference and Western Conference winner who then face off in the finals
    public static Team simulateConference (List<Team> conference){
        System.out.println("First Round:\n--------");
        Team matchup1 = simSeries(conference.get(0), conference.get(7));
        Team matchup2 = simSeries(conference.get(3), conference.get(4));
        Team matchup3 = simSeries(conference.get(2), conference.get(5));
        Team matchup4 = simSeries(conference.get(1), conference.get(6));

        System.out.println("Second Round:\n--------");
        Team matchup5 = simSeries(matchup1, matchup2);
        Team matchup6 = simSeries(matchup3, matchup4);

        System.out.println("Conference finals:\n--------");
        return simSeries(matchup5, matchup6);
    }//simulateConference
}//class
