public class Main {
    public static void main(String[] args) throws Exception {
        DataInputOutputConsole inputOutputConsole = new DataInputOutputConsole();
        NumberVerification numberVerification = new NumberVerification();
        ConverterRomanArabic converterRomanArabic = new ConverterRomanArabic();
        OperationСalculation calc = new OperationСalculation();
        Calculator calculator = new Calculator(inputOutputConsole, numberVerification, converterRomanArabic, calc);
        calculator.start();
    }
}
