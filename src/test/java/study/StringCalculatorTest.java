package study;

import StringCalculatorV1.StringCalculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    @DisplayName("정상 로직 테스트")
    void calculateTest() {
        StringCalculator stringCalculator = new StringCalculator("1 + 2 + 3 * 4");
        Assertions.assertThat(stringCalculator.getResult()).isEqualTo(24);
    }
    
    @Test
    @DisplayName("비정상 로직 테스트1")
    void invalidInputTest1(){
        StringCalculator stringCalculator = new StringCalculator("1 1 + 2 * 3");
        Assertions.assertThatThrownBy(stringCalculator::getResult)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("연산자가 아닌 다른 값이 들어갔습니다.");
    }

    @Test
    @DisplayName("비정상 로직 테스트2")
    void invalidInputTest2(){
        StringCalculator stringCalculator = new StringCalculator("+ 1 + 2 * 3");
        Assertions.assertThatThrownBy(stringCalculator::getResult)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("첫 값이 숫자가 아닙니다.");
    }
}
