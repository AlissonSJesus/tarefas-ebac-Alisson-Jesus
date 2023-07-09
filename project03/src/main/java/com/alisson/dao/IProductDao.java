package com.alisson.dao;

import java.util.List;

import com.alisson.domain.Product;

public interface IProductDao {
    public Integer postProduct(Product product) throws Exception;
    public Product getProduct(Integer id) throws Exception;
    public List<Product> listProduct() throws Exception;
    public Integer putProduct(Product product) throws Exception;
    public Integer deleteProduct(Integer id) throws Exception;
}
