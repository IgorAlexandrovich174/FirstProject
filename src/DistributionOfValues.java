public class DistributionOfValues {
    private String firstNumber;
    private String secondNumber;
    private String operator;

    DistributionOfValues(String firstNumber, String secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }
}
