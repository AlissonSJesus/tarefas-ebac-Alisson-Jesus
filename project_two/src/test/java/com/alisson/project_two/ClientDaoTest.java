package com.alisson.project_two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import com.alisson.project_two.dao.ClientDaoMock;
import com.alisson.project_two.dao.IClientDao;
import com.alisson.project_two.dao.exceptions.TipoChaveNaoEncontradaException;
import com.alisson.project_two.domain.Client;

public class ClientDaoTest {
    IClientDao clientDao;
    Client client = new Client();

    public ClientDaoTest() {
        clientDao = new ClientDaoMock();
    }

     @BeforeTestClass
    public void init() throws TipoChaveNaoEncontradaException{
        client.setName("Alisson");
        client.setCpf(4836392939L);
        client.setPhone(55719943535L);
        client.setAdress("Rua do Pela Porco");
        client.setNumber(23);
        client.setCity("Salvador");
        client.setState("Bahia");

        clientDao.cadastrar(client);
    }

    @Test
    public void getClientTest() {
        assertEquals(null, clientDao.consultar(client.getCpf()));
    }

    @Test
    @DisplayName("Teste de cadastro de cliente")
    public void saveClient() throws TipoChaveNaoEncontradaException{
        assertEquals(true, clientDao.cadastrar(client));
    }

    @Test
    @DisplayName("Teste de remoção de cliente")
    public void deleteClient() {
        clientDao.delete(client.getCpf());
    }

    @Test
    @DisplayName("Teste de cadastro de cliente")
    public void updateClient() throws TipoChaveNaoEncontradaException{
        client.setName("Alisson");
        assertEquals("Alisson", client.getName());
    }
}
