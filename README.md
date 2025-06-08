 # NBA Playoff Simulator

This is a Java console application that simulates the NBA Playoffs from start to finish. It begins by calculating the regular season standings for both the Western and Eastern Conferences based on each team's win total. Once the teams are seeded, the program simulates every round of the playoffs, following the official NBA bracket structure.

Each series is run as a best-of-seven, with accurate home-court advantage given to the higher-seeded team using the 2-2-1-1-1 format. Game outcomes are determined probabilistically, factoring in team win percentages and home-court boosts. After simulating each round, the two conference champions face off in the NBA Finals, and the program ultimately declares an NBA Champion based on the outcome of that final series.



## How to Run

1. **Clone the repository:**

   git clone https://github.com/Devinec45/nba-playoff-simulator.git  
   cd nba-playoff-simulator
   

2. **Compile the program:**

   javac Main.java PostSeason.java Team.java
   

3. **Run the program:**

   
   java Main
   

You should see the regular season standings, each playoff round, and the final champion printed in your console.


# Example Output

Second Round:
--------
Cleveland Cavaliers  vs  Indiana Pacers  
Cleveland Cavaliers win the series 4-2

New York Knicks  vs  Boston Celtics  
Boston Celtics win the series 4-3

Conference finals:
--------
Cleveland Cavaliers  vs  Boston Celtics   
Boston Celtics win the series 4-0


======== NBA Finals ========
-----------------
Denver Nuggets  vs  Boston Celtics  
Boston Celtics win the series 4-2


The Boston Celtics are your NBA Champions
