// BasketballTeam.java
public class BasketballTeam extends SportsTeam {
    protected int fieldGoals;
    protected int fieldGoalsAttempted;
    protected int freeThrows;
    protected int freeThrowsAttempted;

    // Empty-argument constructor
    public BasketballTeam() {
        super();
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }

    // Preferred constructor
    public BasketballTeam(String teamName, int wins, int losses,
                          int fieldGoals, int fieldGoalsAttempted,
                          int freeThrows, int freeThrowsAttempted) {
        super(teamName, wins, losses);
        this.fieldGoals = fieldGoals;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.freeThrows = freeThrows;
        this.freeThrowsAttempted = freeThrowsAttempted;
    }

    // Get the field goal percentage
    public double fieldGoalPercentage() {
        if (fieldGoalsAttempted == 0) {
            return 0.0;
        }
        return (double) fieldGoals / fieldGoalsAttempted;
    }

    // Get the free throw percentage
    public double freeThrowPercentage() {
        if (freeThrowsAttempted == 0) {
            return 0.0;
        }
        return (double) freeThrows / freeThrowsAttempted;
    }

    // Get the statistics (win percentage, field goal percentage, free throw percentage)
    @Override
    public double[] getStats() {
        double winPercentage = getWinPercentage();
        double fieldGoalPercentage = fieldGoalPercentage();
        double freeThrowPercentage = freeThrowPercentage();

        return new double[]{winPercentage, fieldGoalPercentage, freeThrowPercentage};
    }
}
