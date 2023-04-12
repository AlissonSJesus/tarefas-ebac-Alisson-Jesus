import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names = "";
        ListNames listNames = new ListNames();
        try {
            System.out.println("Olá! Digite o nome de pessoas, separando-os por vígula:");
            names = scan.nextLine();
            ArrayList<String> result = listNames.handleNames(names);
            Collections.sort(result);

            System.out.println("+++++++++ Resultado +++++++++");
            System.out.println(result);
            System.out.println("-----------------------------");
            scan.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
