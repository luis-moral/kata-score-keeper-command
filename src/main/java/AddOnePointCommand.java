public class AddOnePointCommand implements Command {

    public static final int ONE_POINT = 1;

    private Score score;

    public AddOnePointCommand(Score score) {
        this.score = score;
    }

    @Override
    public void execute() {
        score.addPoints(ONE_POINT);
    }

    @Override
    public void undo() {
        score.addPoints(-ONE_POINT);
    }
}
