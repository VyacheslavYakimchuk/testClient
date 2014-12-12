package test.client.service;

import test.client.dao.ClientDAO;
import test.client.model.Client;

/**
 * Created by TeSla on 10.12.2014.
 */
public class ClientService {
    private ClientDAO clientDAO;

    public ClientService(){
        clientDAO = new ClientDAO();
    }

    public int create(Client client) {
        return clientDAO.create(client);
    }

    public Client read(int id) {
        return clientDAO.read(id);
    }

    public void update(Client client) {
        clientDAO.update(client);
    }

    public void delete(int id) {
        clientDAO.delete(id);
    }

}

