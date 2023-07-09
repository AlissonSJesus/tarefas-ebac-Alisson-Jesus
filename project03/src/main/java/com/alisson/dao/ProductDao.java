package com.alisson.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alisson.domain.Product;
import com.alisson.jdbc.ConnectionFactory;

public class ProductDao implements IProductDao {

    @Override
    public Integer postProduct(Product product) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = postQuery();
            statement = connection.prepareStatement(query);
            postParams(statement, product);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public Product getProduct(Integer id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        Product product = null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = getQuery();
            statement = connection.prepareStatement(query);
            getParams(statement, id);
            resultSet = statement.executeQuery();

            if(resultSet.next()) {
                product = new Product();

                Integer dbId = resultSet.getInt("PRODUCT_ID");
                String name = resultSet.getString("NAME");
                String brand = resultSet.getString("BRAND");
                Double price = resultSet.getDouble("PRICE");

                product.setId(dbId);
                product.setName(name);
                product.setBrand(brand);
                product.setPrice(price);
            }

            return product;
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, resultSet);
        }
    }

    @Override
    public List<Product> listProduct() throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Product> list = null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = listQuery();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                list = new ArrayList<Product>();
                Product product = new Product();

                Integer id = resultSet.getInt("PRODUCT_ID");
                String name = resultSet.getString("NAME");
                String brand = resultSet.getString("BRAND");
                Double price = resultSet.getDouble("PRICE");

                product.setId(id);
                product.setName(name);
                product.setBrand(brand);
                product.setPrice(price);

                list.add(product);
            }

            return list;
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, resultSet);
        }
    }

    @Override
    public Integer putProduct(Product product) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = putQuery();
            statement = connection.prepareStatement(query);
            putParams(statement, product);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public Integer deleteProduct(Integer id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = deleteQuery();
            statement = connection.prepareStatement(query);
            deleteParams(statement, id);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    public String postQuery() {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TB_PRODUCT(NAME, BRAND, PRICE) ");
        query.append("VALUES(?, ?, ?)");
        return query.toString();
    }

    public void postParams(PreparedStatement statement, Product product) throws SQLException {
        try {
            statement.setString(1, product.getName());
            statement.setString(2, product.getBrand());
            statement.setDouble(3, product.getPrice());
        } catch (SQLException e) {
            throw e;
        }
    }

    public String getQuery() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM TB_PRODUCT WHERE PRODUCT_ID = ?");
        return query.toString();
    }

    public void getParams(PreparedStatement statement, Integer id) throws SQLException {
        try {
            statement.setInt(1, id);
        } catch (Exception e) {
            throw e;
        }
    }

    public String listQuery() throws SQLException {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM TB_PRODUCT");
        return query.toString();
    }

    public String putQuery() {
        StringBuilder query = new StringBuilder();
        query.append("UPDATE TB_PRODUCT SET NAME = ?, BRAND = ?, PRICE = ? WHERE PRODUCT_ID = ?");
        return query.toString();
    }

    public void putParams(PreparedStatement statement, Product product) throws SQLException{
        try {
            statement.setString(1, product.getName());
            statement.setString(2, product.getBrand());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getId());
        } catch (Exception e) {
            throw e;
        }
    }

    public String  deleteQuery() {
        StringBuilder query =  new StringBuilder();
        query.append("DELETE FROM TB_PRODUCT WHERE PRODUCT_ID = ?");
        return query.toString();
    }

    public void deleteParams(PreparedStatement statement, Integer id) throws SQLException{
        try {
            statement.setInt(1, id);
        } catch (Exception e) {
           throw e;
        }
    }

    public void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet)
            throws SQLException {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            if (resultSet != null && !connection.isClosed()) {
                resultSet.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }
}
