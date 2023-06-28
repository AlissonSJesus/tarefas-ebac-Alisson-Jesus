package com.alisson.project_two;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import com.alisson.project_two.dao.ClientDaoMock;
import com.alisson.project_two.dao.IClientDao;
import com.alisson.project_two.dao.exceptions.TipoChaveNaoEncontradaException;
import com.alisson.project_two.domain.Client;
import com.alisson.project_two.service.ClientService;
import com.alisson.project_two.service.IClientService;

public class ClientServiceTest {
    IClientService clientService;
    Client client = new Client();

    public ClientServiceTest() {
        IClientDao dao = new ClientDaoMock();
        clientService = new ClientService(dao);
    }

    @BeforeTestClass
    public void init() {
        client.setName(null);
        client.setCpf(4836392939L);
        client.setPhone(55719943535L);
        client.setAdress("Rua do Pela Porco");
        client.setNumber(23);
        client.setCity("Salvador");
        client.setState("Bahia");
    }
    
    @Test
    @DisplayName("Teste de busca de cliente")
    public void getClientTest() {
        assertEquals(null, clientService.getByCpf(client.getCpf()));
    }

    @Test
    @DisplayName("Teste de cadastro de cliente")
    public void saveClient() throws TipoChaveNaoEncontradaException {
        assertEquals(true, clientService.save(client));
    }

    @Test
    @DisplayName("Teste de remoção de cliente")
    public void deleteClient() {
        clientService.delete(client.getCpf());
    }

    @Test
    @DisplayName("Teste de busca de cliente")
    public void updateClientTest() throws TipoChaveNaoEncontradaException{
        assertEquals("200 updated", clientService.update(client));
    }
}
