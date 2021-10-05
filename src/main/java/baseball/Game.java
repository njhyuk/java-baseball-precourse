package baseball;

import nextstep.utils.Console;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private final ArrayList<Integer> goal;
    private boolean isContinue = false;

    public Game() {
        this.goal = createGoal();
    }

    public void play() {
        for (boolean isStrikeOut = false; !isStrikeOut; ) {
            ArrayList<Integer> numbers = this.scanNumbers();
            Score score = Umpire.to(goal, numbers);
            isStrikeOut = score.isStrikeOut();
        }

        this.isContinue = scanContinue();
    }

    private ArrayList<Integer> scanNumbers() {
        System.out.print("\n 숫자를입력해주세요:");

        ArrayList<Integer> numbers = new ArrayList<>();
        String input = Console.readLine();

        for (String s : input.split("")) {
            numbers.add(Integer.parseInt(s));
        }

        return numbers;
    }

    private boolean scanContinue() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();

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

    public boolean isContinue() {
        return this.isContinue;
    }
}
