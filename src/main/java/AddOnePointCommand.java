public class AddOnePointCommand implements Command {

    private Score score;

    public AddOnePointCommand(Score score) {
        this.score = score;
    }

    @Override
    public void execute() {
        score.addPoints(1);
    }
}
