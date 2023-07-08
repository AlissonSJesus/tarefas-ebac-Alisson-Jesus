package com.alisson.dao;

import java.util.List;

import com.alisson.domain.Client;

public interface IClientDao {
    public Integer post(Client client) throws Exception;
    public Integer put(Client client) throws Exception;
    public Client get(String cpf) throws Exception;
    public List<Client> list() throws Exception;
    public Integer delete(Client client) throws Exception;
}
