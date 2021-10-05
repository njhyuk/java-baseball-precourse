package baseball;

import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        System.out.print("숫자를입력해주세요:");
        String readLine = Console.readLine();
        ArrayList<Integer> inputs = new ArrayList<Integer>();

        for (String s : readLine.split("")) {
            inputs.add(Integer.parseInt(s));
        }

        ArrayList<Integer> randoms = new ArrayList<Integer>(Arrays.asList(7, 1, 3));

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < inputs.size(); i++) {
            Integer input = inputs.get(i);
            
            boolean isStrike = input.equals(randoms.get(i));
            boolean isBall = !isStrike && randoms.contains(input);

            strike += isStrike ? 1 : 0;
            ball += isBall ? 1 : 0;
        }

        System.out.printf("\n Strike %d", strike);
        System.out.printf("\n Ball %d", ball);
    }
}
