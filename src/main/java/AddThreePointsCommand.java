public class AddThreePointsCommand implements Command {

    public static final int THREE_POINTS = 3;

    private Score score;

    public AddThreePointsCommand(Score score) {
        this.score = score;
    }

    @Override
    public void execute() {
        score.addPoints(THREE_POINTS);
    }

    @Override
    public void undo() {
        score.addPoints(-THREE_POINTS);
    }
}
