// SportsTeam.java
public abstract class SportsTeam {
    protected String teamName;
    protected int wins;
    protected int losses;

    // Empty-argument constructor
    public SportsTeam() {
        this.teamName = "";
        this.wins = 0;
        this.losses = 0;
    }

    // Preferred constructor
    public SportsTeam(String teamName, int wins, int losses) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
    }

    // Abstract method to be implemented by subclasses
    public abstract double[] getStats();

    // Get the win percentage
    public double getWinPercentage() {
        if (wins + losses == 0) {
            return 0.0;
        }
        return (double) wins / (wins + losses);
    }
}

