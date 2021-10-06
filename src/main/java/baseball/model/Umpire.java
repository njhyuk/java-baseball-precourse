package baseball.model;

import baseball.model.Player.Computer;
import baseball.model.Player.User;

public class Umpire {
    private final User user;
    private final Computer computer;

    public Umpire(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public Score getScore() {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < this.user.getNumbers().size(); i++) {
            Integer value = this.user.getNumbers().get(i);

            boolean isStrike = value.equals(computer.getNumbers().get(i));
            boolean isBall = !isStrike && computer.getNumbers().contains(value);

            strike += isStrike ? 1 : 0;
            ball += isBall ? 1 : 0;
        }

        return new Score(strike, ball);
    }
}
