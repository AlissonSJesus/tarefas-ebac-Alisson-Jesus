import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static int number;

    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número:");
        number = scanner.nextInt();
        Integer numberTwo = number;

        System.out.println("Valor convertido para Integer: " + numberTwo);
    }
}
