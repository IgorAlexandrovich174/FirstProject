public class ParsingInput {
    public DistributionOfValues parsingStr(String inputValues) {
        int indexOperator = 0;
        String operator = null;
        for (int i = 0; i < inputValues.length(); i++) {
            char value = inputValues.charAt(i);
            if (value == '+') {
                indexOperator = i;
                operator = "+";
                break;
            }
            if (value == '-') {
                indexOperator = i;
                operator = "-";
                break;
            }
            if (value == '*') {
                indexOperator = i;
                operator = "*";
                break;
            }
            if (value == '/') {
                indexOperator = i;
                operator = "/";
                break;
            }

        }
        String firstNumber = inputValues.substring(0, indexOperator);
        String secondNumber = inputValues.substring(indexOperator + 1);
        return new DistributionOfValues(firstNumber,secondNumber,operator);


    }
}

