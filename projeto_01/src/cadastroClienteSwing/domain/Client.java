package cadastroClienteSwing.domain;

public class Client {
    private String name;
    private Long cpf;
    private Long phone;
    private Adress Adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Adress getAdress() {
        return Adress;
    }

    public void setAdress(Adress adress) {
        Adress = adress;
    }

    public Client () {

    }

    public Client(String name, Long cpf, Long phone, Client.Adress adress) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        Adress = adress;
    }

    public static class Adress {
        public static String city;
        public static String state; 
        public static String street;
        public static String neighborhood;
        private Integer number;

        public String getStreet() {
            return street;
        }
        
        public void setStreet(String street) {
            this.street = street;
        }

        public String getNeighborhood() {
            return neighborhood;
        }

        public void setNeighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "Adress: {city:" + city + ",\n" +
            "state:" + state + ",\n" +
            "street:" + street + ",\n" +
            "neighborhood:" + neighborhood + ",\n" +
            "number:" + number + "\n" +
            "}";
        }
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Client {name:" + name + ",\n" +
        "cpf:" + cpf + ",\n" +
        "phone:" + phone + ",\n" +
        Adress + "}";
    }    
}