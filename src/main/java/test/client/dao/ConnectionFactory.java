package test.client.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{
    String driverName = "org.postgresql.Driver";
    String connectionURL = "jdbc:postgresql://localhost:5432/testDB";
    String dbUser = "postgres";
    String dbPwd = "admin";
    static ConnectionFactory connectionFactory = null;

    private ConnectionFactory() throws ClassNotFoundException{
        try{
            Class.forName(driverName);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    static ConnectionFactory getInstance(){
        if (connectionFactory == null){
            try {
                connectionFactory = new ConnectionFactory();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connectionFactory;
    }

    public Connection getConnection() throws SQLException{
        Connection conn = DriverManager.getConnection(connectionURL, dbUser, dbPwd);
        return conn;
    }


}