import java.util.regex.Matcher;

public class Calculator {

    private DataInputOutputConsole inputOutput;
    private NumberVerification verification;
    private ConverterRomanArabic converterNumber;
    private OperationСalculation calc;

    Calculator(DataInputOutputConsole inputOutput, NumberVerification verification,
               ConverterRomanArabic converterNumber, OperationСalculation calc) {
        this.inputOutput = inputOutput;
        this.verification = verification;
        this.converterNumber = converterNumber;
        this.calc = calc;
    }

    void start() throws Exception {
        String str;
        while (!(str = inputOutput.input()).equals("close")) {
            if (verification.isArabicNumber(str)) {
                Matcher resultMatch = verification.getMatcherArabicNumber(str);
                int a1 = Integer.parseInt(resultMatch.group(1));
                int b1 = Integer.parseInt(resultMatch.group(3));
                char c = resultMatch.group(2).charAt(0);
                inputOutput.output(calc.calc(a1, b1, c).toString());
            } else if (verification.isRomanNumber(str)) {
                Matcher resultMatch = verification.getMatcherRomanNumber(str);
                int a1 = converterNumber.romanToArabic(resultMatch.group(1));
                int b1 = converterNumber.romanToArabic(resultMatch.group(3));
                char c = resultMatch.group(2).charAt(0);
                inputOutput.output(converterNumber.arabicToRoman(calc.calc(a1, b1, c)));
            } else throw new Exception("Неверно введены данные!!!");
        }
    }
}
