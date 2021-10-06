package baseball.model.Player;

import java.util.ArrayList;

abstract public class Player {
    ArrayList<Integer> numbers;

    public Player(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
