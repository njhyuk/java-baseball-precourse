package baseball.model;

import baseball.model.Player.Computer;
import baseball.model.Player.User;

public class Judgement {
    private final User user;
    private final Computer computer;

    public Judgement(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public Score getScore() {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < this.user.getNumbers().count(); i++) {
            Integer value = this.user.getNumbers().findByPosition(i);

            boolean isStrike = value.equals(computer.getNumbers().findByPosition(i));
            boolean isBall = !isStrike && computer.getNumbers().hasNumber(value);

            strike += isStrike ? 1 : 0;
            ball += isBall ? 1 : 0;
        }

        return new Score(strike, ball);
    }
}
