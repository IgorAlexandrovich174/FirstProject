
public class ParsingInput {
    public DistributionOfValues parsingStr(String inputValues) throws Exception {

        Integer indexOperator = null;
        String operator = null;

        OUTER:
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
        if (indexOperator == null){
            throw new Exception("Вы не ввели оператор!");
        }
        String firstNumber = inputValues.substring(0, indexOperator);
        String secondNumber = inputValues.substring(indexOperator + 1);
        return new DistributionOfValues(firstNumber, secondNumber, operator);
    }
}

