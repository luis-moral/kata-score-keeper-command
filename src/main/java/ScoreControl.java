public class ScoreControl {
    Command[] onePointCommands;
    Command[] twoPointsCommands;
    Command[] threePointsCommands;

    public ScoreControl() {
        onePointCommands = new Command[2];
        twoPointsCommands = new Command[2];
        threePointsCommands = new Command[2];
    }

    public void setCommand(int row, Command onePointCommand, Command twoPointsCommand, Command threePointsCommand) {
        onePointCommands[row] = onePointCommand;
        twoPointsCommands[row] = twoPointsCommand;
        threePointsCommands[row] = threePointsCommand;
    }

    public void addOnePointButtonWasPushed(int row) {
        onePointCommands[row].execute();
    }

    public void addTwoPointsButtonWasPushed(int row) {
        twoPointsCommands[row].execute();
    }

    public void addThreePointsButtonWasPushed(int row) {
        threePointsCommands[row].execute();
    }
}
