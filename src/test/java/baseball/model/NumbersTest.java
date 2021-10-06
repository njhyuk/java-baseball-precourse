package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Numbers 테스트")
public class NumbersTest {
    @Nested
    @DisplayName("포지션으로 숫자를 찾을 때")
    class DescribeFindByPosition {
        @Nested
        @DisplayName("해당 위치에 숫자가 존재하는 경우")
        class ContextExistsNumber {
            @Test
            @DisplayName("숫자를 리턴한다.")
            void it_returns_number() {
                Numbers numbers = new Numbers(new ArrayList<>(Arrays.asList(1, 7, 3)));

                assertEquals(7, numbers.findByPosition(1).intValue());
            }
        }

        @Nested
        @DisplayName("해당 위치에 숫자가 존재하지 않는 경우")
        class ContextNotExistsNumber {
            @Test
            @DisplayName("IndexOutOfBoundsException 예외를 던진다.")
            void it_returns_number() {
                Numbers numbers = new Numbers(new ArrayList<>(Arrays.asList(1, 7, 3)));

                assertThrows(IndexOutOfBoundsException.class, () -> numbers.findByPosition(999));
            }
        }
    }
}