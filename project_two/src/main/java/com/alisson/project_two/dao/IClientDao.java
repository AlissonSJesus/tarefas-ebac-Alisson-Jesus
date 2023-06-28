package com.alisson.project_two.dao;

import com.alisson.project_two.dao.generic.IGenericDAO;
import com.alisson.project_two.domain.Client;

public interface IClientDao extends IGenericDAO<Client>{
    Boolean save(Client client);
    Client getByCpf(Long cpf);
    void delete(Long cpf);
    String update(Client client);
}
