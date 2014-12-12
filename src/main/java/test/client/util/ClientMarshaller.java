package test.client.util;

import test.client.model.Client;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by TeSla on 10.12.2014.
 */
public class ClientMarshaller {
    private static ClientMarshaller clientMarshaller;

    private ClientMarshaller() {
    }

    public static ClientMarshaller getInstance() {
        if (clientMarshaller == null) {
            clientMarshaller = new ClientMarshaller();
        }
        return clientMarshaller;
    }

    public String marshal(Client client) {
        String theXML = "";
        try {
            //File file = new File("D:\\result.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Client.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //jaxbMarshaller.marshal(client,file);
            //jaxbMarshaller.marshal(client, System.out);
            StringWriter writter = new StringWriter();
            jaxbMarshaller.marshal(client, writter);
            theXML = writter.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return theXML;
    }

    public Client unMarshal(String xml) {
        Client client = new Client();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Client.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(xml);
            client = (Client) jaxbUnmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return client;
    }
}
