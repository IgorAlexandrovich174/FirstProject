
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Вводите: ");
        String tempInputValues = input.nextLine();
        String inputValues = tempInputValues.replaceAll("\\s+", "");

        ParsingInput parsingInput = new ParsingInput();
        DistributionOfValues values = parsingInput.parsingStr(inputValues);

        RomanNumbers romNumbers = new RomanNumbers();

        boolean firstRomanNumber = romNumbers.checkRomanNumber(values.getFirstNumber());
        boolean secondRomanNumber = romNumbers.checkRomanNumber(values.getSecondNumber());

        int firstNumber;
        int secondNumber;

        if (firstRomanNumber && !secondRomanNumber){
            throw new Exception("Второе число не римское!");
        }
        if (!firstRomanNumber && secondRomanNumber){
            throw new Exception("Первое число не римское!");
        }
        if (firstRomanNumber){
        firstNumber = romNumbers.romanConvert(values.getFirstNumber());
        secondNumber = romNumbers.romanConvert(values.getFirstNumber());
        }else {
            firstNumber = Integer.parseInt(values.getFirstNumber());
            secondNumber = Integer.parseInt(values.getSecondNumber());
        }

        if (firstNumber > 10 && secondNumber > 10){
            throw new Exception("Оба числа больше недопустимы!Вводите числа не больше десяти!");
        }
        if (firstNumber > 10){
            throw new Exception("Первое число недопустимо!Вводите числа не больше десяти!");
        }
        if (secondNumber > 10){
            throw new Exception("Второе число недопустимо!Вводите числа не больше десяти!");
        }

        String operator = values.getOperator();

        int result = switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new Exception();
        };
        System.out.println("Результат: "+ result);

        input.close();
    }
}