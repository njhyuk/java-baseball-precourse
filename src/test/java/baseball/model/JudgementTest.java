package baseball.model;

import baseball.model.Player.Computer;
import baseball.model.Player.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Judgement 테스트")
class JudgementTest {
    @Nested
    @DisplayName("점수를 판정 할 때")
    class DescribeScoring {
        @Nested
        @DisplayName("아무 숫자도 맞추지 못한 경우")
        class ContextNothing {
            @Test
            @DisplayName("낫싱 점수 객체를 리턴 한다.")
            void it_returns_number() {
                Computer computer = new Computer(
                        new Numbers(new ArrayList<>(Arrays.asList(1, 7, 3)))
                );
                User user = new User(
                        new Numbers(new ArrayList<>(Arrays.asList(0, 0, 0)))
                );

                Judgement judgement = new Judgement(user, computer);
                Score score = judgement.scoring();

                assertTrue(score.isNothing());
            }
        }
    }
}
