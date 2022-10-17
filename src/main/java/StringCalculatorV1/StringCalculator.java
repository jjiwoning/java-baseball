package StringCalculatorV1;

import java.util.regex.Pattern;

public class StringCalculator {

    private String[] values;
    private long answer;

    public StringCalculator(String value) {
        this.values = value.split(" ");
        this.answer = 0;
    }

    private void findFirstValue() {

        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (check(values[0])) {
            int firstNumber = Integer.parseInt(values[0]);
            answer += firstNumber;
            return;
        }

        throw new IllegalArgumentException("첫 값이 숫자가 아닙니다."); // 첫 값이 숫자가 아님 -> 예외 던지기
    }

    public long getResult() {

        findFirstValue();
        String operator = "?";

        for (int i = 1; i < values.length; i++) {
            if (check(values[i])) {
                answer = calculate(Integer.parseInt(values[i]), operator);
            } else {
                operator = values[i];
            }
        }

        return answer;
    }

    private long calculate(int number, String operator) {

        if (operator.equals("+")) {
            return answer + number;
        }

        if (operator.equals("-")) {
            return answer - number;
        }

        if (operator.equals("*")) {
            return answer * number;
        }

        if (operator.equals("/")) {
            return answer / number;
        }

        throw new IllegalArgumentException("연산자가 아닌 다른 값이 들어갔습니다.");
    }

    private boolean check(String value) {

        String regExp = "^\\d*$";

        if (Pattern.matches(regExp, value)) {
            return true;
        }

        return false;
    }
}
