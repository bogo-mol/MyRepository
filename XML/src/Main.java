import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("XML.xml");
        File jFile = new File("JSON.json");
        jFile.createNewFile();
        file.createNewFile();

        Book bookThree = new Book("x-12", "asd", 1957);
        Book bookFour = new Book("x-13", "fgh", 1958);
        List<Book> bookListTwo = List.of(bookThree, bookFour);
        MyList listTwo = new MyList(bookListTwo);

        Book bookOne = new Book("x-10", "qwe", 1955, listTwo);
        Book bookTwo = new Book("x-11", "rty", 1956, listTwo);
        List<Book> bookList = List.of(bookOne, bookTwo);
        MyList list = new MyList(bookList);
        // конвертер в XML через JAXB
        ToXML xxx = new ToXML();
        xxx.BookToXml(list, file);
        System.out.println(xxx.XmlToBook(file));

        System.out.println("=================");
        System.out.println("=================");
        System.out.println("=================");
        //конвертер в JSON через Jackson
        JSONConverter converter = new JSONConverter();
        converter.toJSON(list, jFile);
        System.out.println(converter.toJava(jFile));
    }
}
