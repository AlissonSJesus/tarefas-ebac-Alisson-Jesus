package cadastroClienteSwing.dao;

import cadastroClienteSwing.domain.Client;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class ClientMapDAO implements ClientDAO {
    public Map<Long, Client> map;

    public ClientMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean post(Client client) {
       if(map.containsKey(client.getCpf())) {
        return false;
       }else {
        map.put(client.getCpf(), client);
        return true;
       }
    }

    @Override
    public void delete(Long cpf) {
       if(map.containsKey(cpf)) {
        map.remove(cpf);

        System.out.println("CPF cancelado!");
       }else {
        System.out.println("CPF não cadastrado!");
       }
    }

    @Override
    public void put(Client client) {
        if(map.containsKey(client.getCpf())) {
            Client newClient = map.get(client.getCpf());

            newClient.setName(client.getName());
            newClient.setCpf(client.getCpf());
            newClient.setPhone(client.getPhone());
            newClient.setAdress(client.getAdress());
        }
    }

    @Override
    public Client get(Long cpf) {
        Client client = map.get(cpf);
        return client;
    }

    @Override
    public Collection<Client> list() {
        return map.values();
    }  
}
