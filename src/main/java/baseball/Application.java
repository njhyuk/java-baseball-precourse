package baseball;

public class Application {
    public static void main(String[] args) {
        for (boolean isRetry = true; isRetry;) {
            Game game = new Game();
            game.play();
            isRetry = game.isRetry();
        }
    }
}
