package baseball.model;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersFactory {
    public static Numbers createRandomNumbers() {
        return new Numbers(new ArrayList<>(
                Arrays.asList(
                        Randoms.pickNumberInRange(1, 9),
                        Randoms.pickNumberInRange(1, 9),
                        Randoms.pickNumberInRange(1, 9)
                )
        ));
    }

    public static Numbers createScanNumbers() {
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

        return new Numbers(numbers);
    }
}
