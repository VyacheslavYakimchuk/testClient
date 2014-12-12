package test.client.dao;

import test.client.service.ClientService;
import test.client.model.Client;
import test.client.util.ClientMarshaller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by TeSla on 05.12.2014.
 */
public class Application {


    public static void main(String[] args) throws Exception {
        //ClientService test = new ClientService();
        //ClientMarshaller clientMarshaller = new ClientMarshaller();
        //Client client = new Client();
        /*client.setLastName("Панченко");
        client.setFirstName("Леопольд");
        client.setMidName("Кузьмич");
        client.setJobPosition("менеджер");
        client.setId(5);
        client.setPersonalNumber("2345324523");
        client.setPassportSeries("РО");
        client.setPassportNumber("345543");
        client.setSalary(9000);
        test.update(client);
        //System.out.println(id);*/
        //clientMarshaller.marshal(client);
        //client = clientMarshaller.unMarshal("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><client><id>5</id><last_name>Панченко</last_name><first_name>Леопольд</first_name><mid_name>Кузьмич</mid_name><job_position>менеджер</job_position><personal_number>2345324523</personal_number><passport_series>РО</passport_series><passport_number>345543</passport_number><salary>9000</salary></client>");
        //System.out.println(client.getFirstName());



        String id = "1";
        ClientService clientService = new ClientService();
        Client client = clientService.read(Integer.valueOf(id));

        //ClientMarshaller clientMarshaller = new ClientMarshaller();
        //PrintWriter out = response.getWriter();
        //System.out.println(clientMarshaller.marshal(client));

    }

}
