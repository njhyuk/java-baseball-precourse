package baseball;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Integer[] inputs = {7, 1, 3};
        ArrayList<Integer> randoms = new ArrayList<Integer>(Arrays.asList(7, 1, 3));

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < inputs.length; i++) {
            boolean isStrike = inputs[i].equals(randoms.get(i));
            boolean isBall = !isStrike && randoms.contains(inputs[i]);

            strike += isStrike ? 1 : 0;
            ball += isBall ? 1 : 0;
        }

        System.out.printf("\n Strike %d", strike);
        System.out.printf("\n Ball %d", ball);
    }
}
