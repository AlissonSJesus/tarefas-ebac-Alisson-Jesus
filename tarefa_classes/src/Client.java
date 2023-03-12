public class Client {
    private int id;
    private String name;
    private String adress;
    private String phone;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printClient() {
        System.out.println("Restaurante Da Fazenda");
        System.out.println("+=====================================+");
        System.out.println("Código: " + getId());
        System.out.println("Cliente: " + getName());
        System.out.println("Endereço: " + getAdress());
    }
}