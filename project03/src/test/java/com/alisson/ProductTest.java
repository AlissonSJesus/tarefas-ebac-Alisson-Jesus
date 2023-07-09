package com.alisson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.alisson.dao.ProductDao;
import com.alisson.domain.Product;

public class ProductTest implements ITest {
    ProductDao productDao = new ProductDao();

    @Test
    @Override
    public void postTest() throws Exception {
        Product product = new Product();
        product.setName("Iphone 13 Pro");
        product.setBrand("Apple");
        product.setPrice(1300.74);

        Integer count = productDao.postProduct(product);
        assertEquals(1, count);
    }

    @Test
    @Override
    public void getTest() throws Exception {
        Integer id = 1;
        Product dbProduct = productDao.getProduct(id);
        assertEquals(id, dbProduct.getId());
    }

    @Test
    @Override
    public void putTest() throws Exception {
        Product product = new Product();
        product.setId(1);
        product.setName("Moutain Bike 2000");
        product.setBrand("Caloi Xtreme");
        product.setPrice(2500.00);

        Integer count = productDao.putProduct(product);
        assertEquals(1, count);
    }

    @Test
    @Override
    public void listTest() throws Exception {
        List<Product> list = new ArrayList<Product>();
        Integer count = 1;

        list = productDao.listProduct();
        assertEquals(count, list.size());
    }

    @Test
    @Override
    public void deleteTest() throws Exception {
        Integer id = 1;
        Integer count = productDao.deleteProduct(id);
        assertEquals(1, count);
    }
}
