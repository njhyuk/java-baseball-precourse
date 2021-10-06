package baseball.model;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

@DisplayName("NumbersFactoryTest 테스트")
class NumbersFactoryTest {
    @Nested
    @DisplayName("숫자 리스트를 생성 할때")
    class DescribeCreateNumbers {
        @Nested
        @DisplayName("랜덤 숫자 리스트를 생성 하면")
        class ContextCreateRandomNumbers {
            @Test
            @DisplayName("랜덤한 숫자 리스트를 리턴한다.")
            void it_returns_random_numbers() {
                final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class);

                mockRandoms
                        .when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                        .thenReturn(1, 3, 5);
                Numbers numbers = NumbersFactory.createRandomNumbers();

                assertEquals(1, numbers.findByPosition(0).intValue());
                assertEquals(3, numbers.findByPosition(1).intValue());
                assertEquals(5, numbers.findByPosition(2).intValue());
            }
        }
    }
}
