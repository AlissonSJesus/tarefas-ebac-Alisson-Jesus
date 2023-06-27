package com.alisson.dao;

public class ContractDao implements IContractDao{

    @Override
    public String save() {
        throw new UnsupportedOperationException("Banco desconectado");
    }

    @Override
    public String get() {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public String update() {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public String delete() {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
