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
    @DisplayName("유저의 숫자 리스트를 가져오면")
    class DescribeOf_getNumbers {
        @Test
        @DisplayName("숫자 리스트를 리턴한다.")
        void it_returns_number() {
            Numbers numbers = new Numbers(new ArrayList<>(Arrays.asList(1, 7, 3)));
            User user = new User(numbers);

            assertThat(user.getNumbers()).isInstanceOf(Numbers.class);
        }
    }
}