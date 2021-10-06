package baseball;

import java.util.ArrayList;

public class Score {
    private final int strike;
    private final int ball;

    public Score(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public boolean isStrikeOut() {
        return strike == 3;
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }

    public void printMessage() {
        printStatus();
        printScore();
    }

    private void printStatus() {
        if (isNothing()) {
            System.out.println("낫싱");
        }

        if (isStrikeOut()) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
        }
    }

    private void printScore() {
        ArrayList<String> message = new ArrayList<>();

        if (strike > 0) {
            message.add(String.format("%d 스트라이크", strike));
        }

        if (ball > 0) {
            message.add(String.format("%d 볼", ball));
        }

        System.out.println(String.join(" ", message));
    }
}
