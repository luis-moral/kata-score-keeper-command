public class AddTwoPointsCommand implements Command {

    private Score score;

    public AddTwoPointsCommand(Score score) {
        this.score = score;
    }

    @Override
    public void execute() {
        score.addPoints(2);
    }
}
