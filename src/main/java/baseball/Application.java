package baseball;

public class Application {
    public static void main(String[] args) {
        for (boolean isContinue = true; isContinue;) {
            Game game = new Game();
            game.play();
            isContinue = game.isContinue();
        }
    }
}
