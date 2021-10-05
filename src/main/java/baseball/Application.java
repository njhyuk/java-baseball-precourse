package baseball;

import nextstep.utils.Console;
import nextstep.utils.Randoms;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            randoms.add(Randoms.pickNumberInRange(1, 9));
        }

        System.out.print(randoms);

        while (true) {
            System.out.print("\n 숫자를입력해주세요:");
            String readLine = Console.readLine();
            ArrayList<Integer> inputs = new ArrayList<Integer>();

            for (String s : readLine.split("")) {
                inputs.add(Integer.parseInt(s));
            }

            int strike = 0;
            int ball = 0;

            for (int i = 0; i < inputs.size(); i++) {
                Integer input = inputs.get(i);

                boolean isStrike = input.equals(randoms.get(i));
                boolean isBall = !isStrike && randoms.contains(input);

                strike += isStrike ? 1 : 0;
                ball += isBall ? 1 : 0;
            }

            if (strike > 0) {
                System.out.printf("\n %d 스트라이크", strike);
            }

            if (ball > 0) {
                System.out.printf("\n %d 볼", ball);
            }

            if (strike == 0 && ball == 0) {
                System.out.print("낫싱");
            }

            if (strike == 3) {
                System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
                // todo 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
                break;
            }
        }
    }
}
