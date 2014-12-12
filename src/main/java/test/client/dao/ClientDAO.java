package test.client.dao;

import test.client.model.Client;

import java.sql.*;

/**
 * Created by TeSla on 05.12.2014.
 */
public class ClientDAO {
    private Connection connection = null;
    private PreparedStatement statement = null;
    private ResultSet resultSet = null;

    public ClientDAO() {
    }

    public Connection getConnection() throws SQLException {
        Connection conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    void closeAll() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int create (Client client) {
        int rowId = 0;
        try {
            connection = getConnection();
            String st = "INSERT INTO client(\n" +
                    "            last_name, first_name, mid_name, job_position, personal_number, \n" +
                    "            passport_series, passport_number, salary)\n" +
                    "    VALUES ( ?, ?, ?, ?, ?, \n" +
                    "            ?, ?, ?);\n";
            statement = connection.prepareStatement(st);
            statement.setString(1, client.getLastName());
            statement.setString(2, client.getFirstName());
            statement.setString(3, client.getMidName());
            statement.setString(4, client.getJobPosition());
            statement.setString(5, client.getPersonalNumber());
            statement.setString(6, client.getPassportSeries());
            statement.setString(7, client.getPassportNumber());
            statement.setInt(8, client.getSalary());
            statement.execute();
            String stGet = "SELECT * FROM client " +
                    "       where last_name = ?" +
                    "       and first_name = ?" +
                    "       and mid_name = ?" +
                    "       and job_position = ?" +
                    "       and personal_number = ?" +
                    "       and passport_series = ?" +
                    "       and passport_number = ?" +
                    "       and salary = ?";
            statement = connection.prepareStatement(stGet);
            statement.setString(1, client.getLastName());
            statement.setString(2, client.getFirstName());
            statement.setString(3, client.getMidName());
            statement.setString(4, client.getJobPosition());
            statement.setString(5, client.getPersonalNumber());
            statement.setString(6, client.getPassportSeries());
            statement.setString(7, client.getPassportNumber());
            statement.setInt(8, client.getSalary());
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                rowId = resultSet.getInt("id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return rowId;
    }


    public void update(Client client) {
        try {
            connection = getConnection();
            String stString = "UPDATE client\n" +
                    "   SET last_name=?, first_name=?, mid_name=?, job_position=?, \n" +
                    "       personal_number=?, passport_series=?, passport_number=?, salary=?\n" +
                    " WHERE id = ?";
            statement = connection.prepareStatement(stString);
            statement.setString(1, client.getLastName());
            statement.setString(2, client.getFirstName());
            statement.setString(3, client.getMidName());
            statement.setString(4, client.getJobPosition());
            statement.setString(5, client.getPersonalNumber());
            statement.setString(6, client.getPassportSeries());
            statement.setString(7, client.getPassportNumber());
            statement.setInt(8, client.getSalary());
            statement.setInt(9, client.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            closeAll();
        }
    }

    public test.client.model.Client read(int id) {
        Client client = new Client();
        try {
            connection = getConnection();
            String stString = "select * from client where id=?";
            statement = connection.prepareStatement(stString);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                client.setId(resultSet.getInt("id"));
                client.setLastName(resultSet.getString("last_name"));
                client.setFirstName(resultSet.getString("first_name"));
                client.setMidName(resultSet.getString("mid_name"));
                client.setJobPosition(resultSet.getString("job_position"));
                client.setPersonalNumber(resultSet.getString("personal_number"));
                client.setPassportSeries(resultSet.getString("passport_series"));
                client.setPassportNumber(resultSet.getString("passport_number"));
                client.setSalary(resultSet.getInt("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return client;

    }

    public void delete(int id){
        try {
            connection = getConnection();
            String st = "Delete from client where id = ?";
            statement = connection.prepareStatement(st);
            statement.setInt(1,id);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            closeAll();
        }
    }

}