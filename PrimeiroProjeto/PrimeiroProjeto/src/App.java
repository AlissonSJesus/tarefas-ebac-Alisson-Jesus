public class App {
  public static void main(String[] args) {
        if(args.length > 0) {
            String name = args[0];
            System.out.println("Hello World! Welcome " + name + ".");
            return;
        }
        System.out.println("Hello World!");
    }
}
