package com.alisson.service;

import com.alisson.dao.IContractDao;

public class ContractService implements IContrarctService{
    private IContractDao contractDao; 

    public ContractService(IContractDao dao) {
        this.contractDao = dao;
    }

    public String save() {
        return contractDao.save();
    }

    public String get() {
        return contractDao.get();
    }

    public String update() {
        return contractDao.update();
    }

    public String delete() {
        return contractDao.delete();
    }
}
