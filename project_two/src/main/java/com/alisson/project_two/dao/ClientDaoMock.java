package com.alisson.project_two.dao;

import java.util.Collection;

import com.alisson.project_two.dao.exceptions.TipoChaveNaoEncontradaException;
import com.alisson.project_two.domain.Client;

public class ClientDaoMock implements IClientDao{

    @Override
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
    public Boolean cadastrar(Client entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {
        
    }

    @Override
    public void alterar(Client entity) throws TipoChaveNaoEncontradaException {
        
    }

    @Override
    public Client consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<Client> buscarTodos() {
        return null;
    }
    
}
