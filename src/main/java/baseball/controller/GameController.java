package baseball.controller;

import baseball.model.Game;

public class GameController {
    public void run() {
        for (boolean retry = true; retry;) {
            Game game = new Game();
            game.play();
            retry = game.isWantRetry();
        }
    }
}
