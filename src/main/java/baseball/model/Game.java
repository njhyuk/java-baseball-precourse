package baseball.model;

import baseball.model.Player.Computer;
import baseball.model.Player.User;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    public void play() {
        Computer computer = new Computer(NumbersFactory.createRandomNumbers());

        for (boolean retry = true; retry; ) {
            Judgement umpire = new Judgement(new User(NumbersFactory.createScanNumbers()), computer);
            Score score = umpire.scoring();
            score.printMessage();

            retry = !score.isStrikeOut();
        }
    }

    public boolean isWantRetry() {
        return scanRetry();
    }

    private boolean scanRetry() {
        Scan scan = new Scan(
                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.",
                "1또는 2만 입력 가능 합니다.",
                "^(1|2)$"
        );
        String input = scan.get();

        return input.equals("1");
    }

    private ArrayList<Integer> createGoal() {
        return new ArrayList<>(
                Arrays.asList(
                        Randoms.pickNumberInRange(1, 9),
                        Randoms.pickNumberInRange(1, 9),
                        Randoms.pickNumberInRange(1, 9)
                )
        );
    }
}
