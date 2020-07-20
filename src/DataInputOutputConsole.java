import java.util.Scanner;

public class DataInputOutputConsole {

    private Scanner scanner = new Scanner(System.in);

    private String dataInput() {
        System.out.println("Введите математическое выражение в одну строку : ");
        return scanner.nextLine();
    }

    public String input() {
        return dataInput();
    }

    public void output(String out) {
        System.out.println("Результат вычесления равен : " + out);
    }
}
