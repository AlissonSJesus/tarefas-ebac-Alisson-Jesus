package br.com.factory;

import br.com.factory.factories.ContractFactory;
import br.com.factory.factories.NoContractFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("A", false);
        Factory factory = getFactory(customer);

        factory.create(customer.getGradeRequest());
    }

    private static Factory getFactory(Customer customer) {
        if(customer.isHasCompanyContract()) {
            return new ContractFactory();
        }else {
            return new NoContractFactory();
        }
    }
}
