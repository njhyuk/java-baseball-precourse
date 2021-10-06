package baseball.model.Player;

import baseball.model.Numbers;

abstract public class Player {
    Numbers numbers;

    public Player(Numbers numbers) {
        this.numbers = numbers;
    }

    public Numbers getNumbers() {
        return numbers;
    }
}
