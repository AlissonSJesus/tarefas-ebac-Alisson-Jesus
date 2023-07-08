package com.alisson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.alisson.dao.ClientDao;
import com.alisson.dao.IClientDao;
import com.alisson.domain.Client;

public class ClientTest {
    private IClientDao clientDao = new ClientDao();

    @Test
    public void postTest() throws Exception {
        try {
            Client client = new Client();
            client.setName("Lauro Mau Jardim");
            client.setCPF("00000000000");

            Integer count = clientDao.post(client);
            assertEquals(1, count);
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void getTest() throws Exception {
        try {
            String cpf = "02414785535";
            Client dbClient = clientDao.get(cpf);
            assertEquals(cpf, dbClient.getCPF());
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void putTest() throws Exception {
        try {
            Client client = new Client();
            client.setId(15);
            client.setName("Julieta Maçaneta");
            client.setCPF("03456936482");

            Integer count = clientDao.put(client);
            assertEquals(1, count);
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void listTest() throws Exception {
        try {
            List<Client> list = clientDao.list();
            assertEquals(3, list.size());
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void deleteTest() throws Exception {
        try {
            Client client = new Client();
            client.setId(16);
            client.setName("Lauro Mau Jardim");
            client.setCPF("00000000000");

            Integer count = clientDao.delete(client);
            assertEquals(1, count);
        } catch (Exception e) {
            throw e;
        }
    }
}
