package ru.igor.calculator;

import java.util.Scanner;


public class Calculator {
    private final RomanNumbersService romanNumbersService = new RomanNumbersService();
    private final InputParser inputParser = new InputParser(romanNumbersService);
    private final NumbersValidator numbersValidator = new NumbersValidator();
    private final NumbersProcessor numbersProcessor = new NumbersProcessor();

    public static void main(String[] args) throws Exception {
        RomanNumbersService romanNumbersService = new RomanNumbersService();
        InputParser inputParser = new InputParser(romanNumbersService);
        Calculator startProgramm = new Calculator();
        NumbersValidator numbersValidator = new NumbersValidator();
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        startProgramm.startProgramm();

    }

    private void startProgramm() throws Exception {
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
}