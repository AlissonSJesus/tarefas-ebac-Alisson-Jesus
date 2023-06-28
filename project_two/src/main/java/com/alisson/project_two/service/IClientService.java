package com.alisson.project_two.service;

import com.alisson.project_two.dao.exceptions.TipoChaveNaoEncontradaException;
import com.alisson.project_two.domain.Client;

public interface IClientService {
    Boolean save(Client client) throws TipoChaveNaoEncontradaException;
    Client getByCpf(Long cpf);
    void delete(Long cpf);
    String update(Client client) throws TipoChaveNaoEncontradaException;
}
