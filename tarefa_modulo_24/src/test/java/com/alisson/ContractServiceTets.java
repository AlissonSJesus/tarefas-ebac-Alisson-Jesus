package com.alisson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.alisson.dao.ContractDao;
import com.alisson.dao.IContractDao;
import com.alisson.mocks.ContractDaoMock;
import com.alisson.service.ContractService;
import com.alisson.service.IContrarctService;

public class ContractServiceTets {
    @Test
    @DisplayName("Testando o método save()")
    public void saveTest() {
        IContractDao contractDao = new ContractDaoMock();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.save();
        assertEquals("201 created", response);
    }

    @Test
    @DisplayName("Testando o método get()")
    public void getTest() {
        IContractDao contractDao = new ContractDaoMock();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.get();
        assertEquals("200", response);
    }

    @Test
    @DisplayName("Testando o método update()")
    public void updateTest() {
        IContractDao contractDao = new ContractDaoMock();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.update();
        assertEquals("200 updated", response);
    }

    @Test
    @DisplayName("Testando o método delete()")
    public void deleteTest() {
        IContractDao contractDao = new ContractDaoMock();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.delete();
        assertEquals("200 deleted", response);
    }

    @Test()
    @DisplayName("Tratando excessões no método save()")
    public void exceptionTest() {
        IContractDao contractDao = new ContractDao();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.save();
        assertEquals("201 created", response);
    }

    @Test
    @DisplayName("Testando excessões no método get()")
    public void exceptionGetTest() {
        IContractDao contractDao = new ContractDao();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.get();
        assertEquals("200", response);
    }

    @Test
    @DisplayName("Testando excessões no método update()")
    public void exceptionUpdateTest() {
        IContractDao contractDao = new ContractDao();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.update();
        assertEquals("200 updated", response);
    }

     @Test
    @DisplayName("Testando excessões no método delete()")
    public void exceptionDeleteTest() {
        IContractDao contractDao = new ContractDao();
        IContrarctService contractService = new ContractService(contractDao);
        String response = contractService.delete();
        assertEquals("200 deleted", response);
    }

}
