package ru.igor.calculator;

import java.util.Scanner;


public class Calculator {
    private final InputParser inputParser;
    private final NumbersValidator numbersValidator;
    private final NumbersProcessor numbersProcessor;

    public Calculator(InputParser inputParser,
                      NumbersValidator numbersValidator,
                      NumbersProcessor numbersProcessor) {
        this.inputParser = inputParser;
        this.numbersValidator = numbersValidator;
        this.numbersProcessor = numbersProcessor;
    }

    public void getResult() throws Exception {
        String inputValue = enterData();
        ParseResult parseResult = inputParser.parseStr(inputValue);
        numbersValidator.validate(parseResult);
        int result = numbersProcessor.processNumbers(parseResult);
        System.out.println("Результат: " + result);


    }

    private static String enterData() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Вводите: ");
            return input.nextLine().replaceAll("\\s+", "");
        }
    }

    public static void main(String[] args) throws Exception {

        RomanNumbersService romanNumbersService = new RomanNumbersService();
        InputParser inputParser = new InputParser(romanNumbersService);

        NumbersValidator numbersValidator = new NumbersValidator();
        NumbersProcessor numbersProcessor = new NumbersProcessor();

        Calculator calculator = new Calculator(inputParser, numbersValidator, numbersProcessor);
        calculator.getResult();


    }
}