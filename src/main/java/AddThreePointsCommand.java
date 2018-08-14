public class AddThreePointsCommand implements Command {

    private Score score;

    public AddThreePointsCommand(Score score) {
        this.score = score;
    }

    @Override
    public void execute() {
        score.addPoints(3);
    }
}
