package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Scan 테스트")
public class ScanTest {
    @Nested
    @DisplayName("유저의 인풋을 입력 받을 때")
    class DescribeGet {
        @Nested
        @DisplayName("입력 유효성에 통과 하는 경우")
        class ContextValidInput {
            @Test
            @DisplayName("입력값을 리턴한다.")
            void it_returns_number() {
                Numbers numbers = new Numbers(new ArrayList<>(Arrays.asList(1, 7, 3)));

                assertEquals(7, numbers.findByPosition(1).intValue());
            }
        }
    }
}