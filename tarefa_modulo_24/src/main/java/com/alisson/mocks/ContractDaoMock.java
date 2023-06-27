package com.alisson.mocks;

import com.alisson.dao.IContractDao;

public class ContractDaoMock implements IContractDao{

    @Override
    public String save() {
         return "201 created";
    }
    
    public String get() {
        return "200";
    }

    public String update() {
        return "200 updated";
    }

    @Override
    public String delete() {
        return "200 deleted";
    }
}
