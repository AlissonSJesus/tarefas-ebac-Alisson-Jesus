import java.util.Scanner;

public class App {
    static Float[] scores = new Float[4];

    static Average average = new Average();
    static Messages message = new Messages();

    static String answer = new String();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        do {
            for (int i = 0; i < 4; i++) {
                System.out.println("Digite a nota " + (i + 1) + " do aluno:");
                scores[i] = scanner.nextFloat();
            }

            Float mid = average.handleAverage(scores);

            System.out.println("A média do aluno é: " + mid);

            if(average.handleAverage(scores) >= 7) {
                System.out.println(message.aproved);
            }else if(mid < 7 && mid >= 5) {
                System.out.println(message.limbo);
            }else {
                System.out.println(message.reproved);
            }

            System.out.println("============><============");
            System.out.println("Deseja inserir notas do próximo aluno? [S/N]");
            answer = scanner.next();

        } while (answer.equalsIgnoreCase("S"));

        scanner.close();
        System.out.println(message.succsess);
    }
}
