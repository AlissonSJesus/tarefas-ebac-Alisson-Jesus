import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<String> femalePeople = new ArrayList<String>();
        List<String> malePeople = new ArrayList<String>();
        List<String> undefined = new ArrayList<String>();

        try {
            System.out.println("Olá, Digite o nome e o sexo do cadastrado, separando pessoas por vírgula (Ex.: Carlos - M, Luane - F):");
            String[] rawPeople = scan.nextLine().trim().split(",");

            for(int i = 0; i < rawPeople.length; i++) {
                if(rawPeople[i].contains("- F")) {
                    femalePeople.add(rawPeople[i]);
                }else if(rawPeople[i].contains("- M")) {
                    malePeople.add(rawPeople[i]);
                }else {
                    undefined.add(rawPeople[i]);
                }
            }
            System.out.println("----------- Masculino -----------");
            System.out.println(malePeople);
            System.out.println("----------- Feminino -----------");
            System.out.println(femalePeople);
            System.out.println("--------------------------------");
            System.out.println("Erro na leitura dos dados de " +  undefined);

            scan.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
