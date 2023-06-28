package com.alisson.project_two.dao;

import com.alisson.project_two.dao.generic.GenericDAO;
import com.alisson.project_two.domain.Client;

public class ClientDao extends GenericDAO<Client> implements IClientDao{

    public ClientDao() {
        super();
    }

    public Boolean save(Client client) {
        return true;
    }

    @Override
    public Client getByCpf(Long cpf) {
       Client client = new Client();
       client.setCpf(cpf);
       return client;
    }

    @Override
    public void delete(Long cpf) {
        
    }

    @Override
    public String update(Client client) {
        return "200 updated";
    }

    @Override
    public Class<Client> getTipoClasse() {
        return Client.class;
    }

    @Override
    public void atualiarDados(Client entity, Client entityCadastrado) {
        
    }
}
