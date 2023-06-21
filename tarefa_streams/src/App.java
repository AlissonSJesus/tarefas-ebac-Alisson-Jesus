import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        List<String> intermediateList = new ArrayList<String>();
        List<String> finalList = new ArrayList<String>();

        String name;
        String gender;
        String condition;

        try {
            do {
                System.out.println("Digite o nome do usuário: ");
                name = scan.nextLine();

                System.out.println("Digite o sexo do usuário: ");
                gender = scan.nextLine();

                list.add(name + "-" + gender);

                System.out.println("Deseja inserir outro usuário [S/N]?");
                condition = scan.nextLine();

            } while (condition.equalsIgnoreCase("s"));

             
            list.stream().filter(item -> item.contains("Feminino")).forEach(item -> intermediateList.add(item));

            for(int i = 0; i < intermediateList.size(); i++) {
                String[] response = intermediateList.get(i).split("-");
                String clientName = response[0];
                finalList.add(clientName);
                response = new String[2];
            }

            System.out.println(finalList);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scan.close();
        }
    }
}
