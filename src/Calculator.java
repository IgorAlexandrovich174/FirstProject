
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputValues = input.nextLine();

        ParsingInput parsingInput = new ParsingInput();
        DistributionOfValues values = parsingInput.parsingStr(inputValues);

        int firstNumber = Integer.parseInt(values.getFirstNumber());
        int secondNumber = Integer.parseInt(values.getSecondNumber());
        String operator = values.getOperator();

        switch (operator) {
            case "+" -> System.out.println(firstNumber + secondNumber);
            case "-" -> System.out.println(firstNumber - secondNumber);
            case "*" -> System.out.println(firstNumber * secondNumber);
            case "/" -> System.out.println(firstNumber / secondNumber);
            default -> System.out.println("Введен невереный оператор!");
        }

    }
}



