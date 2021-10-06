package baseball.model;

import java.util.ArrayList;

public class Umpire {
    public static Score to(ArrayList<Integer> goal, ArrayList<Integer> numbers) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);

            boolean isStrike = number.equals(goal.get(i));
            boolean isBall = !isStrike && goal.contains(number);

            strike += isStrike ? 1 : 0;
            ball += isBall ? 1 : 0;
        }

        return new Score(strike, ball);
    }
}
