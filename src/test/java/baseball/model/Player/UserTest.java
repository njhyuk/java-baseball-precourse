package baseball.model.Player;

import baseball.model.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("User 테스트")
class UserTest {
    @Nested
    @DisplayName("유저를 생성할때")
    class DescribeCreateUser {
        @Nested
        @DisplayName("생성시에 입력된 숫자 리스트를 확인 하면")
        class ContextGetNumbers {
            @Test
            @DisplayName("숫자 리스트를 리턴한다.")
            void it_returns_number() {
                Numbers numbers = new Numbers(new ArrayList<>(Arrays.asList(1, 7, 3)));
                User user = new User(numbers);

                assertThat(user.getNumbers()).isInstanceOf(Numbers.class);
            }
        }
    }
}