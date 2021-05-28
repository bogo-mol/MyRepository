import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ToXML {
    public void BookToXml(MyList list, File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MyList.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(list, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public MyList XmlToBook(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MyList.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (MyList) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}