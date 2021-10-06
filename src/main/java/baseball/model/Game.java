package baseball.model;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private final ArrayList<Integer> goal;

    public Game() {
        this.goal = createGoal();
    }

    public void play() {
        for (boolean retry = true; retry; ) {
            ArrayList<Integer> numbers = this.scanNumbers();

            Score score = Umpire.to(goal, numbers);
            score.printMessage();

            retry = !score.isStrikeOut();
        }
    }

    public boolean isWantRetry() {
        return scanRetry();
    }

    private ArrayList<Integer> scanNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scan scan = new Scan(
                "숫자를입력해주세요:",
                "세자리 숫자로 입력 해 주세요.",
                "^[0-9]{3}$"
        );
        String input = scan.get();

        for (String s : input.split("")) {
            numbers.add(Integer.parseInt(s));
        }

        return numbers;
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
