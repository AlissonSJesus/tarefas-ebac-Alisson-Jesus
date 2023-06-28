package com.alisson.project_two.service;

import com.alisson.project_two.dao.IClientDao;
import com.alisson.project_two.dao.exceptions.TipoChaveNaoEncontradaException;
import com.alisson.project_two.domain.Client;

public class ClientService implements IClientService{
    private IClientDao clientDao;

    public ClientService() {

    }

    public ClientService(IClientDao dao) {
        this.clientDao = dao;
    }

    @Override
    public Boolean save(Client client) throws TipoChaveNaoEncontradaException {
        return clientDao.cadastrar(client);
    }

    @Override
    public Client getByCpf(Long cpf) {
        return clientDao.consultar(cpf);
    }

    @Override
    public void delete(Long cpf) {
        
    }

    @Override
    public String update(Client client) throws TipoChaveNaoEncontradaException {
        return clientDao.update(client);
    }
    
}
