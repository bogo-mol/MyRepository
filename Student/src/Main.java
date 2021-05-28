import ua.com.prologistic.jaxb.model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbWorker {

    public static void main(String[] args) {
        // определяем название файла, куда будем сохранять
        String fileName = "F:/students.xml";

        //создаем объект Student с какими-то данными
        Student student = new Student();
        student.setId(1);
        student.setAge(21);
        student.setName("Andrew");
        student.setLanguage("Java");
        student.setPassword("simplepassword");

        // сохраняем объект в XML файл
        convertObjectToXml(student, fileName);

        // восстанавливаем объект из XML файла
        Student unmarshStudent = fromXmlToObject(fileName);
        if (unmarshStudent != null) {
            System.out.println(unmarshStudent.toString());
        }
    }


    // восстанавливаем объект из XML файла
    private static Student fromXmlToObject(String filePath) {
        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Student) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    // сохраняем объект в XML файл
    private static void convertObjectToXml(Student student, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(student, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
