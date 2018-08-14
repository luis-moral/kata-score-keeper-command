import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreKeeperShould {

    @Test public void
    keep_the_teams_scores() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB3();

        assertThat(scoreKeeper.getScore()).isEqualTo("003:007");
    }

    @Test public void
    keep_the_teams_scores_and_handle_undo() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB1();

        assertThat(scoreKeeper.getScore()).isEqualTo("003:003");

        scoreKeeper.undo();

        assertThat(scoreKeeper.getScore()).isEqualTo("003:002");

        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB3();

        assertThat(scoreKeeper.getScore()).isEqualTo("003:006");
    }
}
