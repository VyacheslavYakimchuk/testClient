package test.client.resource;

import test.client.model.Client;
import test.client.service.ClientService;
import test.client.util.ClientMarshaller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by TeSla on 10.12.2014.
 */
public class ClientServlet extends HttpServlet {
    private ClientService clientService;
    private ClientMarshaller clientMarshaller;
    private Client client;

    public ClientServlet() {
    }

    public void init() {
        clientService = new ClientService();
        clientMarshaller = ClientMarshaller.getInstance();
    }

    String getBody(HttpServletRequest request) throws IOException {
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String id = request.getParameter("id");
        Client client = clientService.read(Integer.parseInt(id));
        PrintWriter out = response.getWriter();
        String clientXML = clientMarshaller.marshal(client);
        out.println(clientXML);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String body = getBody(request);
        client = clientMarshaller.unMarshal(body);
        clientService.create(client);
    }

    @Override
    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String body = getBody(request);
        client = clientMarshaller.unMarshal(body);
        clientService.update(client);
    }

    @Override
    public void doDelete(HttpServletRequest request, HttpServletResponse response) {
        String st = request.getParameter("id");
        int id = Integer.parseInt(st);
        clientService.delete(id);
    }
}
