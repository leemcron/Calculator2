public class OperationСalculation {

    public Integer calc(int num1, int num2, char operation) {

        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
    }
}
