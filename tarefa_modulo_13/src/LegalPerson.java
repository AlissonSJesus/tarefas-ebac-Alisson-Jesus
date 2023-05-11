public class LegalPerson extends Person {
    private String cnpj;
    private String corporateName;
    private String stateRegistration;
    private String cnae;

    public String getStateRegistration() {
        return stateRegistration;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public String getCnae() {
        return cnae;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String toString() {
        return "pessoaJuridica: {\n" +
        "   cnpj: " + cnpj + ",\n" +
        "   cnae: " + cnae + ",\n" +
        "   inscricaoEstadual: " + stateRegistration + ",\n" +
        "   corporateName: " + corporateName + ",\n" +
            getAdress() + "\n" +
        "   nome: " + getName() + "\n" +
        "   telefone: " + getPhone() + "\n" +
        "}\n";
    }
}
