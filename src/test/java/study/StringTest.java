package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] strings = "1,2".split(",");
        assertThat(strings).containsExactly("1", "2");
    }

    @Test
    void subString(){
        String target = "(1,2)";
        String result = target.substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 함수 학습 테스트")
    void charAt(){
        String target = "abc";
        char result = target.charAt(0);
        assertThat(result).isEqualTo('a');
        assertThatThrownBy(() -> target.charAt(4))
                .isInstanceOf(StringIndexOutOfBoundsException.class);
    }

}
