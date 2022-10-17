public class StringCalculator {

    private String[] value;
    private long answer;

    public StringCalculator(String value) {
        this.value = value.split(" ");
        this.answer = 0;
    }

    public void printAnswer(){
        findFirstValue();

        System.out.println(answer);
    }

    private void findFirstValue() {
        int firstNumber = Integer.parseInt(value[0]);
        answer += firstNumber;
    }

    private void getSum(String[] value, long answer) {

        for (int i = 1; i < value.length; i++) {

        }

    }

}
