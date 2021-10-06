package baseball.model;

import java.util.ArrayList;

public class Numbers {
    ArrayList<Integer> numbers;

    public Numbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer count() {
        return this.numbers.size();
    }

    public Integer findByPosition(Integer position) {
        return this.numbers.get(position);
    }

    public boolean hasNumber(Integer number) {
        return this.numbers.contains(number);
    }
}
