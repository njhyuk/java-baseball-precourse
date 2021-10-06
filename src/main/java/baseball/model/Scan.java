package baseball.model;

import nextstep.utils.Console;

public class Scan {
    private final String hintMessage;
    private final String errorMessage;
    private final String regex;

    public Scan(String hintMessage, String errorMessage, String regex) {
        this.hintMessage = hintMessage;
        this.errorMessage = errorMessage;
        this.regex = regex;
    }

    public String get() {
        String input = "";

        for (boolean isValid = false; !isValid; ) {
            System.out.print(hintMessage);
            input = Console.readLine();
            isValid = validInput(input);
        }

        return input;
    }

    private boolean validInput(String input) {
        boolean isValid = input.matches(regex);

        if (!isValid) {
            System.out.println("[ERROR] " + errorMessage);
        }

        return isValid;
    }
}
