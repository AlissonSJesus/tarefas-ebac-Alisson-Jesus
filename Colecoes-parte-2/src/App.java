import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String name = "";
        String gender = "";
        String decision = "";

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> maleList = new ArrayList<String>();
        ArrayList<String> femaleList = new ArrayList<String>();

        try {
            do {
                System.out.println("Digite o nome do inscrito(a):");
                name = scan.nextLine();

                System.out.println("Digite o sexo do inscrito(a):");
                gender = scan.nextLine();

                if (gender.equalsIgnoreCase("Feminino")) {
                    femaleList.add(name);
                } else if (gender.equalsIgnoreCase("Masculino")) {
                    maleList.add(name);
                } else {
                    System.out.println("Erro ao ler gênero!");
                }

                list.add(name + ": " + gender);

                System.out.println("Deseja continuar? [S/N]");
                decision = scan.nextLine();

            } while (decision.equalsIgnoreCase("s"));
        } catch (Exception e) {
            scan.close();
            System.out.println("Erro: " + e);
        }

        if (!maleList.isEmpty() || !femaleList.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.printf("Inscritos do sexo masculino: %s%n", maleList);
            System.out.println("------------------------------------");
            System.out.printf("Inscritos do sexo feminino: %s%n", femaleList);
            System.out.println("====================================");
            System.out.println("Fim");
        }else {
            System.out.println("Fim");
        }
    }
}
