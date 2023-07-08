package com.alisson.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alisson.domain.Client;
import com.alisson.jdbc.ConnectionFactory;

public class ClientDao implements IClientDao {

    @Override
    public Integer post(Client client) throws Exception {
         Connection connection = null;
         PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getInstance();
            String sql = postSqlInsert();
            statement = connection.prepareStatement(sql);
            postParameters(statement, client);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public Integer put(Client client) throws Exception {
        Connection connection = null;
        PreparedStatement statement =  null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = putSqlUpdate();
            statement = connection.prepareStatement(query);
            putParameters(statement, client);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeConnection(connection, statement, null);
        }
        
    }

    @Override
    public Client get(String cpf) throws Exception {
        Client client = null;
        Connection connection = null;
        PreparedStatement statement =  null;
        ResultSet resultSet =  null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = getSqlQuery();
            statement = connection.prepareStatement(query);
            getParameters(statement, cpf);
            resultSet = statement.executeQuery();
            
            if(resultSet.next()) {
                client = new Client();
                Integer id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String dbCpf = resultSet.getString("CPF");
                client.setId(id);
                client.setName(name);
                client.setCPF(dbCpf);
            }

            return client;
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, resultSet);
        }
    }

    @Override
    public List<Client> list() throws Exception {
        List<Client> list = new ArrayList<Client>();
        Connection connection = null;
        PreparedStatement statement =  null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = listSql();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                Client client = new Client();
                Integer id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String cpf = resultSet.getString("CPF");
                client.setId(id);
                client.setName(name);
                client.setCPF(cpf);
                list.add(client);
            }

            return list;
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        
    }

    @Override
    public Integer delete(Client client) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getInstance();
            String query = deleteSql();
            statement = connection.prepareStatement(query);
            deleteParams(statement, client);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, statement, null);
        }
    }
    
    public String postSqlInsert() {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TB_CLIENT(NAME, CPF) ");
        query.append("VALUES(?, ?)");
        return query.toString();
    }

    public void postParameters(PreparedStatement statement, Client client) throws SQLException {
        try {
             statement.setString(1, client.getName());
             statement.setString(2, client.getCPF());
        } catch (SQLException e) {
            throw e;
        }
    }

    public String putSqlUpdate() {
        StringBuilder query = new StringBuilder();
        query.append("UPDATE TB_CLIENT SET NAME = ?, CPF = ? WHERE ID = ?");
        return query.toString(); 
    }

    public void putParameters(PreparedStatement statement, Client client) throws SQLException{
        try {
            statement.setString(1, client.getName());
            statement.setString(2, client.getCPF());
            statement.setLong(3, client.getId());
        } catch(SQLException e) {
            throw e;
        }
    }

    public String getSqlQuery() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM TB_CLIENT ");
        query.append("WHERE CPF = ?");
        return query.toString();
    }

    public void getParameters(PreparedStatement statement, String cpf) throws SQLException {
        try {
            statement.setString(1, cpf);
        } catch (SQLException e) {
            throw e;
        }
        
    }

    public String listSql() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM TB_CLIENT");
        return query.toString();
    }

    public String deleteSql() {
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM TB_CLIENT WHERE ID = ?");
        return query.toString();
    }

    public void deleteParams(PreparedStatement statement, Client client) throws SQLException{
        try {
            statement.setLong(1, client.getId());
        } catch (Exception e) {
            throw e;
        }
    }

    public void closeConnection(Connection connection, PreparedStatement statement, ResultSet set) throws SQLException {
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }

            if(statement != null && !statement.isClosed()) {
                statement.close();
            }

            if(set != null && !set.isClosed()) {
                set.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
