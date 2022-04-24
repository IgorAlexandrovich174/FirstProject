package ru.igor.calculator;

public class RomanNumbersService {

    public String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public boolean checkRomanNumber(String number) {
        for (int i = 0; i < romanNumbers.length; i++) {
            String romanValue = romanNumbers[i];
            if (romanValue.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public int romanConvert(String romanNumber) throws Exception {
        for (int i = 0; i < romanNumbers.length; i++) {
            String romanValue = romanNumbers[i];
            if (romanValue.equals(romanNumber)) {
                return i + 1;
            }
        }
        throw new Exception("Число не римское!");
    }

    public String intToRoman(int number) throws Exception {
        for (int i = 0; i < romanNumbers.length; i++) {
            if (number == i) {
                return romanNumbers[i + 1];
            }
        }
        throw new Exception();
    }
}

