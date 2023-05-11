public class NaturalPerson extends Person{
    private String cpf;
    private String rg;
    private String cnh;
    private String motherName;
    private String fatherName;

    public NaturalPerson() {

    }

    public NaturalPerson(String cpf, String rg, String cnh, String motherName, String fatherName) {
        this.cpf = cpf;
        this.rg = rg;
        this.cnh = cnh;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getCnh() {
        return cnh;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    @Override
    public String toString() {
        return "pessoaFisica: {\n" + "   cpf: " + cpf + ",\n" + "   rg: " + rg + ",\n" + "   cnh: " + cnh + ",\n" + "   nomeMae: " + motherName + ",\n" + "   nomePai: " + fatherName + ",\n" + getAdress() + "\n" + "   nome:" + getName() + "\n" + "   telefone:" + getPhone() + "\n" + "}\n";
    }
}
