public class App {
    public static void main(String[] args) throws Exception {
        // instance of person's adress 
        Person.Adress nPAdress = new Person.Adress("Rua do Torto", "Centro", 345);
        Person.Adress lPAdress = new Person.Adress("Avenida Bahia", "Federação", 1480);

        // instance of legal person and natural person
        LegalPerson golam = new LegalPerson();
        NaturalPerson carlos = new NaturalPerson("024.012.312-32", "8976534-23","00000000" , "Maria", "José");
        
        // building a natural person
        carlos.setName("Carlos Eduardo");
        carlos.setPhone("(81) 9 9832-2312");
        carlos.setAdress(nPAdress);

        // building a legal person
        golam.setCnpj("34.234.345/0001-76");
        golam.setCorporateName("Golam Enterprise");
        golam.setCnae("6204-0/00");
        golam.setAdress(lPAdress);
        golam.setName("GA Serviços Tecnlógicos");
        golam.setPhone("(81) 9 3424-4545");

        // out
        System.out.println(carlos);
        System.out.println(golam);


    }
}
