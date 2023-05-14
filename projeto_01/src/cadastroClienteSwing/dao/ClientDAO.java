package cadastroClienteSwing.dao;

import cadastroClienteSwing.domain.Client;
import java.util.Collection;



public interface ClientDAO {
    public Boolean post(Client client);

    public void delete(Long cpf);

    public void put(Client client);

    public Client get(Long cpf);

    public Collection<Client> list();
}