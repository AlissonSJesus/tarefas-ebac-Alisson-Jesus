public class App {
    public static void main(String[] args) throws Exception {
        float num1 = 7;
        float num2 = 8;
        float num3 = 10;
        float num4 = 5;

        Average average = new Average();
        float studantAverage = average.getAverage(num1, num2, num3, num4);

        System.out.println("A média requerida é: " + studantAverage);

        if(studantAverage > 7) {
            System.out.println("Parabéns! Você foi aprovado.");
        }else {
            System.out.println("Lamentamos, você não alcançou a nota necessária para a aprovação!");
        }
    }
}
