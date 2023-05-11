public abstract class Person {
    private Adress adress;
    private String phone;
    private String name;

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public static class Adress {
        private String street;
        private String neighborhood;
        private int number;

        public Adress(String street, String neighborhood, int number) {
            this.street = street;
            this.neighborhood = neighborhood;
            this.number = number;

        }

        @Override
        public String toString() {
            return "   endereco: {" + "\n" +
                "   rua: " + street + ",\n" +
                "   bairro: " + neighborhood + ",\n" +
                "   numero: " + number + "\n" +
            "   }";
        }
    }
}
