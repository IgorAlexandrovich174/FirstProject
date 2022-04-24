package ru.igor.calculator;

public class NumbersProcessor {
    public int processNumbers(ParseResult parseResult) throws Exception {
        String operator = parseResult.getOperator();

        return switch (operator) {
            case "+" -> parseResult.getFirstNumber() + parseResult.getSecondNumber();
            case "-" -> parseResult.getFirstNumber() - parseResult.getSecondNumber();
            case "*" -> parseResult.getFirstNumber() * parseResult.getSecondNumber();
            case "/" -> parseResult.getFirstNumber() / parseResult.getSecondNumber();
            default -> throw new Exception();
        };

    }
}
