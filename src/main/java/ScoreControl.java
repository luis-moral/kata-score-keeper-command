public class ScoreControl {
    private Command[] onePointCommands;
    private Command[] twoPointsCommands;
    private Command[] threePointsCommands;
    private Command lastCommand;

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
        lastCommand = onePointCommands[row];
    }

    public void addTwoPointsButtonWasPushed(int row) {
        twoPointsCommands[row].execute();
        lastCommand = twoPointsCommands[row];
    }

    public void addThreePointsButtonWasPushed(int row) {
        threePointsCommands[row].execute();
        lastCommand = threePointsCommands[row];
    }

    public void undoLastButtonWasPushed() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}
