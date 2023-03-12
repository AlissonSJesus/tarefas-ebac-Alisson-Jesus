public class App {
    public static void main(String[] args) throws Exception {
        
        Client client = new Client();
        
        int id = 1;
        String name = "Joel Carvalho Copra";
        String adress = "Rua da Guanabara, 304. Rio de Contas - Bahia.";

        client.setId(id);
        client.setName(name);
        client.setAdress(adress);

        client.printClient();
    }
}
