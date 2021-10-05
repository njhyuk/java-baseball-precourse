package baseball;

public class Score {
    private final int strike;
    private final int ball;

    public Score(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isStrikeOut() {
        return strike == 3;
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }

    public void printMessage() {
        if (strike > 0) {
            System.out.printf("\n %d 스트라이크", strike);
        }

        if (ball > 0) {
            System.out.printf("\n %d 볼", ball);
        }

        if (isNothing()) {
            System.out.print("낫싱");
        }

        if (isStrikeOut()) {
            System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
        }
    }
}
