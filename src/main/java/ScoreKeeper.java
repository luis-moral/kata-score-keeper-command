public class ScoreKeeper {

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

        scoreControl.setCommand(0, addOnePointToTeamACommand, addTwoPointsToTeamACommand, addThreePointsToTeamACommand);
        scoreControl.setCommand(1, addOnePointToTeamBCommand, addTwoPointsToTeamBCommand, addThreePointsToTeamBCommand);

    }

    public void scoreTeamA1() {
        scoreControl.addOnePointButtonWasPushed(0);
    }

    public void scoreTeamA2() {
        scoreControl.addTwoPointsButtonWasPushed(0);
    }

    public void scoreTeamA3() {
        scoreControl.addThreePointsButtonWasPushed(0);
    }

    public void scoreTeamB1() {
        scoreControl.addOnePointButtonWasPushed(1);
    }

    public void scoreTeamB2() {
        scoreControl.addTwoPointsButtonWasPushed(1);
    }

    public void scoreTeamB3() {
        scoreControl.addThreePointsButtonWasPushed(1);
    }

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamA.getPoints(), scoreTeamB.getPoints());
    }
}
