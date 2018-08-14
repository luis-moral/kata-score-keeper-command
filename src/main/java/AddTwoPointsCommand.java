public class AddTwoPointsCommand implements Command {

    public static final int TWO_POINTS = 2;

    private Score score;

    public AddTwoPointsCommand(Score score) {
        this.score = score;
    }

    @Override
    public void execute() {
        score.addPoints(TWO_POINTS);
    }

    @Override
    public void undo() {
        score.addPoints(-TWO_POINTS);
    }
}
