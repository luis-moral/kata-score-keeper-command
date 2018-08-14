public class ScoreKeeper {

    public static final int TEAM_A = 0;
    public static final int TEAM_B = 1;
    private ScoreControl scoreControl;
    private Score scoreTeamA;
    private Score scoreTeamB;

    public ScoreKeeper() {
        scoreControl = new ScoreControl();

        scoreTeamA = new Score();
        scoreTeamB = new Score();

        AddOnePointCommand addOnePointToTeamACommand = new AddOnePointCommand(scoreTeamA);
        AddOnePointCommand addOnePointToTeamBCommand = new AddOnePointCommand(scoreTeamB);

        AddTwoPointsCommand addTwoPointsToTeamACommand = new AddTwoPointsCommand(scoreTeamA);
        AddTwoPointsCommand addTwoPointsToTeamBCommand = new AddTwoPointsCommand(scoreTeamB);

        AddThreePointsCommand addThreePointsToTeamACommand = new AddThreePointsCommand(scoreTeamA);
        AddThreePointsCommand addThreePointsToTeamBCommand = new AddThreePointsCommand(scoreTeamB);

        scoreControl.setCommand(TEAM_A, addOnePointToTeamACommand, addTwoPointsToTeamACommand, addThreePointsToTeamACommand);
        scoreControl.setCommand(TEAM_B, addOnePointToTeamBCommand, addTwoPointsToTeamBCommand, addThreePointsToTeamBCommand);
    }

    public void scoreTeamA1() {
        scoreControl.addOnePointButtonWasPushed(TEAM_A);
    }

    public void scoreTeamA2() {
        scoreControl.addTwoPointsButtonWasPushed(TEAM_A);
    }

    public void scoreTeamA3() {
        scoreControl.addThreePointsButtonWasPushed(TEAM_A);
    }

    public void scoreTeamB1() {
        scoreControl.addOnePointButtonWasPushed(TEAM_B);
    }

    public void scoreTeamB2() {
        scoreControl.addTwoPointsButtonWasPushed(TEAM_B);
    }

    public void scoreTeamB3() {
        scoreControl.addThreePointsButtonWasPushed(TEAM_B);
    }

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamA.getPoints(), scoreTeamB.getPoints());
    }

    public void undo() {
        scoreControl.undoLastButtonWasPushed();
    }
}
