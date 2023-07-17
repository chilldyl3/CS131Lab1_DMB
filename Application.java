public class Application {
    public static void main(String[] args) {
        // Testing the SportsTeam class
        SportsTeam team1 = new BasketballTeam("Team A", 15, 5, 150, 300, 50, 70);
        SportsTeam team2 = new BasketballTeam("Team B", 10, 10, 120, 250, 30, 50);

        System.out.println("Team 1 Win Percentage: " + team1.getWinPercentage());
        System.out.println("Team 2 Win Percentage: " + team2.getWinPercentage());

        // Testing the BasketballTeam class
        BasketballTeam basketballTeam1 = new BasketballTeam("Team C", 20, 2, 180, 300, 60, 70);
        BasketballTeam basketballTeam2 = new BasketballTeam("Team D", 12, 10, 100, 220, 40, 60);

        double[] team1Stats = basketballTeam1.getStats();
        double[] team2Stats = basketballTeam2.getStats();

        System.out.println("Team 1 Statistics:");
        System.out.println("Win Percentage: " + team1Stats[0]);
        System.out.println("Field Goal Percentage: " + team1Stats[1]);
        System.out.println("Free Throw Percentage: " + team1Stats[2]);

        System.out.println("Team 2 Statistics:");
        System.out.println("Win Percentage: " + team2Stats[0]);
        System.out.println("Field Goal Percentage: " + team2Stats[1]);
        System.out.println("Free Throw Percentage: " + team2Stats[2]);
    }
}

